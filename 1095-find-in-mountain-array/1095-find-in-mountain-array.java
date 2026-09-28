/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length()-1;
        int low=0;
        int high=n;
        int i=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                i=mid+1;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        int a=0;
        int j=i+1;
        while(a<=i){
            int mid=a+(i-a)/2;
            if(mountainArr.get(mid)==target)return mid;
            else if(mountainArr.get(mid)<target)a=mid+1;
            else i=mid-1;
        }
        while(j<=n){
            int mid=j+(n-j)/2;
            if(mountainArr.get(mid)==target)return mid;
            else if(mountainArr.get(mid)<target)n=mid-1;
            else j=mid+1;
        }
        return -1;
    }
}