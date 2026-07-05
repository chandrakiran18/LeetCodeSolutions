class Solution {
    public boolean checkRecord(String s) {
        char[] record=s.toCharArray();
        int abs=0;
        int late=0;
        for(char c:record){
            if(c=='A'){
                abs++;
                if(abs>=2)return false;
                late=0;
            }
            if(c=='L'){
                late++;
                if(late==3)return false;
            }
            else{
                late=0;
            }
        }
        return true;
    }
}