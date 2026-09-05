class Solution {
    public int totalFruit(int[] fruits) {
        int r=0;
        int l=0;
        int n=fruits.length;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            int x=fruits[r];
            r++;
            map.put(x,map.getOrDefault(x,0)+1);
            while(map.size()>2){
                int y=fruits[l];
                map.put(y,map.getOrDefault(y,0)-1);
                if(map.getOrDefault(y,0)==0){
                    map.remove(y);
                }
                l++;
            }
            ans=Math.max(ans,r-l);
        }
        return ans;
    }
}