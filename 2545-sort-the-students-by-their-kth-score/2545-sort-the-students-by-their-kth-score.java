class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        HashMap<Integer,Integer> exam=new HashMap<>();
        int m=score.length;
        int n=score[0].length;
        for(int i=0;i<m;i++){
            exam.put(score[i][k],i);
        }
        int[] marks=new int[exam.size()];
        int ind=0;
        for(int ex:exam.keySet()){
            marks[ind++]=ex;
        }
        Arrays.sort(marks);
        int x=marks.length-1;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=score[exam.get(marks[x])][j];
            }
            x--;
        }
        return ans;
    }
}