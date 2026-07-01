class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha1=new int[26];
        int[] alpha2=new int[26];
        for(char c:ransomNote.toCharArray()){
            int ind=c-'a';
            alpha1[ind]+=1;
        }
        for(char c:magazine.toCharArray()){
            int ind=c-'a';
            alpha2[ind]+=1;
        }
        for(char c:ransomNote.toCharArray()){
            int ind=c-'a';
            if(alpha1[ind]>alpha2[ind])return false;
        }
        return true;
    }
}