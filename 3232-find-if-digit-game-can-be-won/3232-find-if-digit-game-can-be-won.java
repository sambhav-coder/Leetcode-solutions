class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                sum2+=nums[i];
            }
            else{
                sum1+=nums[i];
            }
        }
        if(sum2>sum1 || sum1>sum2){
            return true;
        }
        else{
            return false;
        }
        
    }
}