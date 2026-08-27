class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] a=new int[26];
        int k=s1.length();
        int n=s2.length();
        if(k>n)return false;
        for(char c:s1.toCharArray()){
            a[c-'a']++;
        }
        int i=0,j=0;
        while(j<n){
            char c=s2.charAt(j);
            a[c-'a']--;
            if(j-i+1==k){
                boolean flag=true;
                for(int x=0;x<26;x++){
                    if(a[x]!=0){
                        flag=false;
                        break;
                    }
                }
                if(flag)return true;
                a[s2.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return false;
    }
}