class Solution {
    public String largestNumber(int[] nums) {
        String[] parts=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            parts[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(parts,(s1,s2)->(s2+s1).compareTo(s1+s2));
        if(parts[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String s:parts){
            sb.append(s);
        }
        return sb.toString();
    }
}