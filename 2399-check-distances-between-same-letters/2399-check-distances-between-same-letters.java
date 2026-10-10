class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashSet<Character> set=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(!set.contains(c)){
                int diff=0;
                for(int j=i+1;j<n;j++){
                    if(s.charAt(j)==c){
                        diff=j-i-1;
                        set.add(c);
                        break;
                    }
                }
                if(distance[c-'a']!=diff)return false;
            }
        }
        return true;
    }
}