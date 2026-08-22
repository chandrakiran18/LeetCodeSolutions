class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        int[] result=new int[arr1.size()+arr2.size()];
        int i=0;
        for(int n:arr1){
            result[i]=n;
            i++;
        }
        for(int n:arr2){
            result[i]=n;
            i++;
        }
        return result;
    }
}