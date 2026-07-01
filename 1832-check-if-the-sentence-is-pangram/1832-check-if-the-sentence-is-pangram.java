class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)return false;
        int[] alpha=new int[26];
        for(char c:sentence.toCharArray()){
            int ind=c-'a';
            alpha[ind]=1;
        }
        for(int n:alpha){
            if(n<1)return false;
        }
        return true;
    }
}