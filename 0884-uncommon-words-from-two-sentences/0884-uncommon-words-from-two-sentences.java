class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String[] p1=s1.split(" ");
        String[] p2=s2.split(" ");
        for(String s:p1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:p2){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> li=new ArrayList<>();
        for(String s:p1){
            if(map.get(s)==1)li.add(s);
        }
        for(String s:p2){
            if(map.get(s)==1)li.add(s);
        }
        int n=li.size();
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}