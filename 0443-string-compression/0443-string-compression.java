class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int j=0;
        while(i<n){
            char c=chars[i];
            int count=0;
            while(i<n && chars[i]==c){
                i++;
                count++;
            }
            chars[j++]=c;
            if(count>1){
                for(char ch:String.valueOf(count).toCharArray()){
                    chars[j++]=ch;
                }
            }
        }
        return j;
    }
}