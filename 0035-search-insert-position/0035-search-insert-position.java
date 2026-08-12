class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        //insert if not found
        for(int i=0;i<nums.length;i++){
            if(target<nums[i]){
                return i;
            }
        }
        return nums.length;
        
    }

}