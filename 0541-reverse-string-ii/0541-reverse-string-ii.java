class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i+=2*k){
            int x=i;
            int j=Math.min(i+k-1,arr.length-1);
            while(x<j){
                char temp=arr[x];
                arr[x]=arr[j];
                arr[j]=temp;
                x++;
                j--;
            }
        }   
        return new String(arr);
    }
}