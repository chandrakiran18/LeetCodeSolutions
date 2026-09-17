class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        for(String s:words){
            for(String str:words){
                if(s.length()<str.length()&& str.contains(s)){
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
    }
}