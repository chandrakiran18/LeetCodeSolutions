class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha1=new int[26];
        int[] alpha2=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            int ind=c-'a';
            alpha1[ind]+=1;
        }
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            int ind=c-'a';
            alpha2[ind]+=1;
        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            int ind=c-'a';
            if(alpha1[ind]>alpha2[ind])return false;
        }
        return true;
    }
}