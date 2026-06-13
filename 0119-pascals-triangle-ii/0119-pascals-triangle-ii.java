class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                temp.add(val);
            }
            if(i>0){
                temp.add(1);
            }
            ans.add(temp);
        }
        return ans.get(rowIndex);
    }
}