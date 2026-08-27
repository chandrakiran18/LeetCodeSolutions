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
        int i=0;
        int j=0;
        while(j<n){
            char c=s.charAt(j);
            b[c-'a']++;
            if(j-i+1==k){
                boolean flag=true;
                for(int x=0;x<26;x++){
                    if(a[x]!=b[x]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    ans.add(i);
                }
                char d=s.charAt(i);
                b[d-'a']--;
                i++;
            }
            j++;
        }
        return ans;
    }
}