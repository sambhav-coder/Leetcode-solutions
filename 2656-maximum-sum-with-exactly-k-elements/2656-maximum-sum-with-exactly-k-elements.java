class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        int sum=0;
        while(k>0){
            for(int i=0;i<nums.length;i++){
                max=Math.max(max,nums[i]);   
            }
            sum+=max;
            max+=1;
            k--;
        }
        return sum;
    }
}