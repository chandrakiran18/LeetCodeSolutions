class Solution {
    public int toNthDay(String date){
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));
        int total=0;
        for(int i=0;i<month-1;i++){
            total+=months[i];
        }
        return total+day;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceArival=toNthDay(arriveAlice);
        int bobArival=toNthDay(arriveBob);
        int lAlice=toNthDay(leaveAlice);
        int lBob=toNthDay(leaveBob);
        int start=Math.max(aliceArival,bobArival);
        int end=Math.min(lAlice,lBob);
        if(end<start)return 0;
        return end-start+1;
    }
}