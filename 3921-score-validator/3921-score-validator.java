class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int counter=0;
        for(String s:events){
            if(s.equals("W")){
                counter++;
            }else if(s.equals("WD")||s.equals("NB")){
                score++;
            }else{
                score+=Integer.parseInt(s);
            }
            if(counter==10)break;
        }
        return new int[]{score,counter};
    }
}