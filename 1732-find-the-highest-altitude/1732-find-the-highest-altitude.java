class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int[]alti=new int[gain.length+1];
        alti[0]=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            alti[i+1]=sum;
        }
        int max=alti[0];
        for(int j=0;j<alti.length;j++){
            if(alti[j]>max){
                max=alti[j];
            }
        }
        return max;
        
    }
}