class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=s.length();
        int MaxLength=0;
        while(l<r){
            HashSet<Character> set=new HashSet<>();
            for(int i=l;i<r;i++){
                char c=s.charAt(i);
                if(set.contains(c)){
                    break;
                }
                set.add(c);
                MaxLength=Math.max(MaxLength,i-l+1);
            }
            l++;
        }
        return MaxLength;
    }
}