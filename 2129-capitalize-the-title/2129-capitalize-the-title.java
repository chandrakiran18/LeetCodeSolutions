class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder();
        String[] words=title.split(" ");
        int n=words.length;
        for(int i=0;i<n;i++){
            String s=words[i];
            int x=s.length();
            if(x<=2){
                for(char c:s.toCharArray()){
                    sb.append(Character.toLowerCase(c));
                }
            }else{
                sb.append(Character.toUpperCase(s.charAt(0)));
                for(int j=1;j<x;j++){
                    sb.append(Character.toLowerCase(s.charAt(j)));
                }
            }
            if(i!=n-1){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}