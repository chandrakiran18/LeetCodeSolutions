class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        List<Integer> temp=new ArrayList<>();
        for(int n:nums1){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }
        for(int n:nums2){
            if(map1.containsKey(n)&& map1.get(n)>0){
                temp.add(n);
                map1.put(n,map1.get(n)-1);
            }
        }
        int[] ans=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}