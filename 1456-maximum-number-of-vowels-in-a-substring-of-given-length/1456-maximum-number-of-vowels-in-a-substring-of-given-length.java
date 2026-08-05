class Solution {
    boolean isVowel(char c){
        String vowels="aeiou";
        return vowels.indexOf(c)!=-1;
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))count++;
        }
        max=Math.max(max,count);
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i)))count++;
            if(isVowel(s.charAt(i-k)))count--;
            max=Math.max(max,count);
        }
        return max;
    }
}