class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        String vowels="aeiouAEIOU";
        char[] str=s.toCharArray();
        while(i<j){
            while(i<j && vowels.indexOf(str[i])==-1)i++;
            while(i<j && vowels.indexOf(str[j])==-1)j--;
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return new String(str);
    }
}