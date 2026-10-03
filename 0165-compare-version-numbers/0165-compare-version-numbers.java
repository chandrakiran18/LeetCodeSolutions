class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<String> x=new ArrayList<>(Arrays.asList(version1.split("\\.")));
        ArrayList<String> y=new ArrayList<>(Arrays.asList(version2.split("\\.")));
        while(x.size()!=y.size()){
            if(x.size()<y.size()){
                x.add("0");
            }else{
                y.add("0");
            }
        }
        for(int i=0;i<x.size();i++){
            String a=x.get(i);
            String b=y.get(i);
            int c=0;
            int d=0;
            if(a.length()>1){
                while(c<a.length() && a.charAt(c)=='0')c++;
            }
            if(b.length()>1){
                while(d<b.length() && b.charAt(d)=='0')d++;
            }
            if(c==a.length())a="0";
            else{
                a=a.substring(c,a.length());
            }
            if(d==b.length())b="0";
            else{
                b=b.substring(d,b.length());
            }
            int val1=Integer.parseInt(a);
            int val2=Integer.parseInt(b);
            if(val1>val2)return 1;
            else if(val1<val2)return -1;
        }
        return 0;
    }
}