class Solution {
    public String reversePrefix(String s, int k) {
        char[] c=s.toCharArray();
        int i=0;
        while(i<k){
            char temp=c[i];
            c[i]=c[k-1];
            c[k-1]=temp;
            k--;
            i++;
        }
        return new String(c);
    }
}