class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char ch:text.toCharArray()){
            if(ch=='b')b++;
            else if(ch=='a')a++;
            else if(ch=='l')l++;
            else if(ch=='o')o++;
            else if(ch=='n')n++;
        }
        int min=Integer.MAX_VALUE;
        if(b<min){
            min=b;
        }
        if(a<min){
            min=a;
        }
        if(l/2<min)min=l/2;
        if(o/2<min)min=o/2;
        if(n<min)min=n;
        return min;
    }
}