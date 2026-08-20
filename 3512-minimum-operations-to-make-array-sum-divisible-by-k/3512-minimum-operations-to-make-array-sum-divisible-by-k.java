class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        while(true){
            if(sum%k==0){
                return count;
            }
            else{
                nums[nums.length-1]=nums[nums.length-1]-1;
                sum--;
                count++;
            }
        }
        
    }
}