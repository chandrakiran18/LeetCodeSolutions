class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        String firstRow="qwertyuiop";
        String SecondRow="asdfghjkl";
        String ThirdRow="zxcvbnm";
        for(int i=0;i<words.length;i++){
            String temp="";
            String s=words[i].toLowerCase();
            char c=s.charAt(0);
            if (firstRow.indexOf(c) != -1) {
                temp=firstRow;
            }else if(SecondRow.indexOf(c) != -1){
                temp=SecondRow;
            }else if(ThirdRow.indexOf(c) != -1){
                temp=ThirdRow;
            }
            int flag=0;
            for(char ch:s.toCharArray()){
                if(temp.indexOf(ch)==-1){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}