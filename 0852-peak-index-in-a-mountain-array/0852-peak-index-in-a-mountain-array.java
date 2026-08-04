class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index=-1;
        int ele=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ele){
                ele=arr[i];
                index=i;
            }
        }
        return index;
    }
}