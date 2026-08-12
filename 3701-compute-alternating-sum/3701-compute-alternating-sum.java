class Solution {
    public int alternatingSum(int[] nums) {
        int tsum=0;
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                evensum=evensum+nums[i];
            }
            else{
                oddsum=oddsum+nums[i];
            }
        }
        tsum=evensum-oddsum;
        return tsum;
        
    }
}