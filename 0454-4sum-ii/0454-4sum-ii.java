class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums1){
            for(int b:nums2){
                int s=a+b;
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        for(int c:nums3){
            for(int d:nums4){
                int s=-1*(c+d);
                if(map.containsKey(s)){
                    ans+=map.get(s);
                }
            }
        }
        return ans;
    }
}