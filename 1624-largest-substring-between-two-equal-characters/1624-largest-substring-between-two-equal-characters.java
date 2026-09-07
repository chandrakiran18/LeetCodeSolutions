class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (map.containsKey(c)) {
                map.get(c).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c, list);
            }
        }
        for(char c:s.toCharArray()){
            int n=map.get(c).size();
            if(n>=2){
                ans=Math.max(ans,map.get(c).get(n-1)-map.get(c).get(0));
            }
        }
        return ans==Integer.MIN_VALUE?-1:ans-1;
    }
}