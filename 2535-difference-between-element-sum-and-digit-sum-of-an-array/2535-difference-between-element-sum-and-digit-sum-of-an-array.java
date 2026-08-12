class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            esum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]<10){
                dsum+=nums[j];
            }
            else{
                int temp=nums[j];
                while(temp>0){
                    dsum+=temp%10;
                    temp/=10;

                }
            }
        }
        return Math.abs(esum-dsum);
        
    }
}