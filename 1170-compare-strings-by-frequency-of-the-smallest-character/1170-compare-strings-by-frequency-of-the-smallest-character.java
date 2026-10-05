class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans=new int[queries.length];
        int[] quer=new int[queries.length];
        int[] wor=new int[words.length];
        for(int i=0;i<queries.length;i++){
            int[] freq=new int[26];
            for(char c:queries[i].toCharArray()){
                freq[c-'a']++;
            }
            for(int j=0;j<26;j++){
                if(freq[j]!=0){
                    quer[i]=freq[j];
                    break;
                }
            }
        }
        for(int i=0;i<words.length;i++){
            int[] freq=new int[26];
            for(char c:words[i].toCharArray()){
                freq[c-'a']++;
            }
            for(int j=0;j<26;j++){
                if(freq[j]!=0){
                    wor[i]=freq[j];
                    break;
                }
            }
        }
        Arrays.sort(wor);
        for(int i=0;i<ans.length;i++){
            int x=quer[i];
            for(int j=0;j<wor.length;j++){
                if(x<wor[j]){
                    ans[i]=wor.length-j;
                    break;
                }
            }
        }
        return ans;
    }
}