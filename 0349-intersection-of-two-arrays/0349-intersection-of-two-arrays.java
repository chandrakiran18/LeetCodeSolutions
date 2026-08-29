class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> temp=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            if(set1.contains(n)){
                temp.add(n);
            }
        }
        int n=temp.size();
        int[] ans=new int[n];
        int i=0;
        for(int x:temp){
            ans[i]=x;
            i++;
        }
        return ans;
    }
}