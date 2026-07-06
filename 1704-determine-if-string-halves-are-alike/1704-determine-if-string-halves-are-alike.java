class Solution {
    public boolean halvesAreAlike(String s) {
        int ind=s.length()/2;
        String one=s.substring(0,ind).toLowerCase();
        String two=s.substring(ind).toLowerCase();
        int count1=0;
        int count2=0;
        String vowels="aeiou";
        for(char c:one.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                count1++;
            }
        }
        for(char c:two.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                count2++;
            }
        }
        return count1==count2;
    }
}