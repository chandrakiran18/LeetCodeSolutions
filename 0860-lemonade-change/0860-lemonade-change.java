class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bal=0;
        int five=0,ten=0;
        for(int n:bills){
            if(n==5)five++;
            else if(n==10){
                ten++;
                if(five==0)return false;
                five--;
            }
            else if(n==20){
                if(five>0 && ten>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}