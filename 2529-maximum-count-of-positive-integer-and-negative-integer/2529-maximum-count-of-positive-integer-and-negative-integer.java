class Solution {
    public int maximumCount(int[] nums) {
        int cn=0;
        int cp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                cp++;
            }
            else if(nums[i]<0){
                cn++;
            }
        }
        return Math.max(cp,cn);
        
        
    }
}