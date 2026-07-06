class Solution {
    public boolean halvesAreAlike(String s) {
        int ind=s.length()/2;
        int count1=0;
        int count2=0;
        String vowels="aeiouAEIOU";
        for(int i=0;i<ind;i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                count1++;
            }
        }
        for(int i=ind;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                count2++;
            }
        }
        return count1==count2;
    }
}