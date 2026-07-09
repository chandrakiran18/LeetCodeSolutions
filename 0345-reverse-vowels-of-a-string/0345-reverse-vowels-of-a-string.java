class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        String vowels="aeiouAEIOU";
        char[] str=s.toCharArray();
        while(i<j){
            char c=str[i];
            if(vowels.indexOf(c)==-1){
                i++;
            }else{
                char ch=str[j];
                if(vowels.indexOf(ch)!=-1){
                    char temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                    i++;
                }
                j--;
            }
        }
        return new String(str);
    }
}