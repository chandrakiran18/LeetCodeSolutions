class Solution {
    public boolean isCircularSentence(String sentence) {
       int n=sentence.length();
       if(sentence.charAt(0)!=sentence.charAt(n-1)){
        return false;
       }
       String[] parts=sentence.split(" ");
       for(int i=0;i<parts.length-1;i++){
        int x=parts[i].length();
        if(parts[i].charAt(x-1) !=parts[i+1].charAt(0)){
            return false;
        }
       }
       return true;
    }
}