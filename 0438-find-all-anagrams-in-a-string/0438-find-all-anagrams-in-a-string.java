class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] a=new int[26];
        int[] b=new int[26];
        List<Integer> ans=new ArrayList<>();
        int k=p.length();
        int n=s.length();
        if(k>n)return ans;
        for(char c:p.toCharArray()){
            a[c-'a']++;
        }
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            b[c-'a']++;
        }
        boolean flag=true;
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                flag=false;
                break;
            }
        }
        if(flag){
            ans.add(0);
        }
        for(int i=k;i<n;i++){
            char c=s.charAt(i);
            char d=s.charAt(i-k);
            b[c-'a']++;
            b[d-'a']--;
            boolean fl=true;
            for(int j=0;j<26;j++){
                if(a[j]!=b[j]){
                    fl=false;
                    break;
                }
            }
            if(fl){
                ans.add(i-k+1);
            }
        }
        return ans;
    }
}