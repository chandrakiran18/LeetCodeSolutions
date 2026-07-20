class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            int curr=nums1[i];
            for(int j=0;j<m;j++){
                int flag=0;
                if(curr==nums2[j]){
                    for(int k=j;k<m;k++){
                        if(nums2[k]>nums2[j]){
                            ans[i]=nums2[k];
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1){
                        break;
                    }
                }
            }
        }
        return ans;
    }
}