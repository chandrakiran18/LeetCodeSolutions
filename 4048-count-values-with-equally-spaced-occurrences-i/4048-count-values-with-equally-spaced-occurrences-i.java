class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans=0;
        int n=nums.length;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(map.containsKey(x)){
                map.get(x).add(i);
            }else{
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(i);
                map.put(x,temp);
            }
        }
        for(Integer a:map.keySet()){
            if(map.get(a).size()==3){
                if(map.get(a).get(1)-map.get(a).get(0)==map.get(a).get(2)-map.get(a).get(1))ans++;
            }
        }
        return ans;
    }
}