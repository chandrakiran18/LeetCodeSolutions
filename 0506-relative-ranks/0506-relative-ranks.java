class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=score[i];
        }
        Arrays.sort(temp);
        String[] ans2 = new String[n];
        int count=1;
        for(int k = n-1; k >=0; k--){
            for(int z = 0; z < n; z++){
                if(temp[k] == score[z]){
                    if(count == 1){
                        ans2[z] = "Gold Medal";
                    }
                    else if(count == 2){
                        ans2[z] = "Silver Medal";
                    }
                    else if(count == 3){
                        ans2[z] = "Bronze Medal";
                    }
                    else{
                        ans2[z] = String.valueOf(count);
                    }
                    break;
                }
            }
            count++;
        }
        return ans2;
    }
}