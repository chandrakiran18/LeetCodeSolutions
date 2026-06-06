class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int n=tokens.length;
        Arrays.sort(tokens);
        int maxScore=0;
        int i=0,j=n-1;
        while(i<=j){
            if(tokens[i]<=power){
                power-=tokens[i];
                i++;
                score++;
            }
            else if(score>0){
                    power+=tokens[j];
                    j--;
                    score--;
                
            }
            else{
                break;
            }
            maxScore=Integer.max(maxScore,score);
        }
        return maxScore;
    }
}