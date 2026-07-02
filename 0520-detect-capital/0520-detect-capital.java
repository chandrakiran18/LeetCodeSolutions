class Solution {
    public boolean detectCapitalUse(String word) {
        int upp=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i)))upp++;
        }
        if(upp==word.length())return true;
        if(upp==0)return true;
        if(upp==1 && word.charAt(0)>='A' && word.charAt(0)<='Z')return true;
        return false;
    }
}