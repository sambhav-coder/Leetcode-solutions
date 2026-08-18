class Solution {
    public int findNumbers(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int orig=nums[i];
            while(nums[i]>0){
                int r=nums[i]%10;
                count++;
                nums[i]=nums[i]/10;
            }
            if(count%2==0){
                num++;
            }
        }
        return num;
        
    }
}