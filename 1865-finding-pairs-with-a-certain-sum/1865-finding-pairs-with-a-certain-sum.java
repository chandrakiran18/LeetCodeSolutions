class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private HashMap<Integer,Integer> map=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        for(int n:nums2){
            map.put(n,map.getOrDefault(n,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int old=nums2[index];
        int newNum=old+val;
        nums2[index]=newNum;
        map.put(newNum,map.getOrDefault(newNum,0)+1);
        map.put(old,map.getOrDefault(old,0)-1);
    }
    
    public int count(int tot) {
        int count=0;
        for(int n:nums1){
            int req=tot-n;
            count+=map.getOrDefault(req,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */