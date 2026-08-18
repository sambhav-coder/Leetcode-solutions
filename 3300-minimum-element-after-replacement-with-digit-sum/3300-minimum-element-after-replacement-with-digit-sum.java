class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            if(nums[i]>=10){
                while(nums[i]>0){
                    int r=nums[i]%10;
                    sum+=r;
                    nums[i]=nums[i]/10;

                }
                nums[i]=sum;
            }
        }
        Arrays.sort(nums);
        return nums[0];
        
        
    }
}