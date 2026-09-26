class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        HashMap<String,String> map=new HashMap<>();
        for(int j=0;j<knowledge.size();j++){
            map.put(knowledge.get(j).get(0),knowledge.get(j).get(1));
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                StringBuilder t=new StringBuilder();
                i++;
                while(i<n && s.charAt(i)!=')')t.append(s.charAt(i++));
                sb.append(map.getOrDefault(t.toString(),"?"));
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}