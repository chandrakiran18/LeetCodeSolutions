class Solution {
    static boolean canPlace(int[] position,int m,int minDist){
        int count=1;
        int prevHub=position[0];
        int n=position.length;
        for(int i=1;i<n;i++){
            if(position[i]-prevHub>=minDist){
                count++;
                prevHub=position[i];
            }
            if(count==m)return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=0;
        int high=position[position.length-1]-position[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPlace(position,m,mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}