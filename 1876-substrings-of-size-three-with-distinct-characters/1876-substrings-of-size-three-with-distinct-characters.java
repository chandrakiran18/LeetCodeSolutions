class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        if(n<3)return ans;
        int k=3;
        for(int i=0;i<k;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==3)ans++;
        for(int i=k;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map.put(s.charAt(i-k),map.getOrDefault(s.charAt(i-k),0)-1);
            if(map.get(s.charAt(i-k))==0){
                map.remove(s.charAt(i-k));
            }
            if(map.size()==3)ans++;
        }
        return ans;
    }
}