class Solution {
    public String reversePrefix(String word, char c) {
        char[] ch=word.toCharArray();
        int n=ch.length;
        int ind=0;
        for(int i=0;i<n;i++){
            if(ch[i]==c){
                ind=i;
                break;
            }
        }
        int i=0;
        while(i<ind){
            char temp=ch[i];
            ch[i]=ch[ind];
            ch[ind]=temp;
            i++;
            ind--;
        }
        return new String(ch);
    }
}