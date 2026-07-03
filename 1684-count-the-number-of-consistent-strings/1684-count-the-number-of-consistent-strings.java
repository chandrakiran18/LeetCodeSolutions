class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int flag=0;
            for(char c:s.toCharArray()){
                int k=allowed.indexOf(c);
                if(k==-1){
                    flag=1;
                    break;
                }
            }
            if(flag==0)count++;
        }
        return count;
    }
}