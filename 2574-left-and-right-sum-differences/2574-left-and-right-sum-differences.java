class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftsum[]=new int[n];
        int rightsum[]=new int[n];
        int ans[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==0){
                leftsum[0]=0;
            }
            else {
                sum+=nums[i-1];
                leftsum[i]=sum;
            }
        }
        int sum1=0;
        for(int j=n-1;j>=0;j--){
            if(j==n-1){
                rightsum[n-1]=0;
            }
            else{
                sum1+=nums[j+1];
                rightsum[j]=sum1;
            }
        }
        for(int k=0;k<n;k++){
            ans[k]=Math.abs(leftsum[k]-rightsum[k]);
        }
        return ans;
    }
}