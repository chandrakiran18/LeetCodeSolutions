class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        List<Integer> temp=new ArrayList<>();
        for(int n:nums1){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }
        for(int n:nums2){
            map2.put(n,map2.getOrDefault(n,0)+1);
        }
        for(int n:nums1){
            if(map1.containsKey(n)&& map2.containsKey(n)){
                if(temp.contains(n))continue;
                int min=Math.min(map1.get(n),map2.get(n));
                for(int i=0;i<min;i++){
                    temp.add(n);
                }
            }
        }
        int n=temp.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}