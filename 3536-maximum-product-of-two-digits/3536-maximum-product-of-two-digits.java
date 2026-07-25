class Solution {
    public int maxProduct(int n) {
        char[] chars=String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        int x=chars.length;
        int d1=chars[x-1]-'0';
        int d2=chars[x-2]-'0';
        return d1*d2;
    }
}