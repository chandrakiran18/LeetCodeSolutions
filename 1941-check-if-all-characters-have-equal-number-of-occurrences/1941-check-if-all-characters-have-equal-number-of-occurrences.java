class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int x=map.get(s.charAt(0));
        for(int n:map.values()){
            if(x!=n)return false;
        }
        return true;
    }
}