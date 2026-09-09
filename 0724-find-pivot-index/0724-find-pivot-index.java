class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        
        // Step 1: Total sum calculate karo
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        
        // Step 2: Iterate karke pivot index dhoondo
        for (int i = 0; i < n; i++) {
            // rightSum = totalSum - leftSum - nums[i]
            int rightSum = totalSum - leftSum - nums[i];
            
            if (leftSum == rightSum) {
                return i;
            }
            
            // Current element ko leftSum mein add karo next iteration ke liye
            leftSum += nums[i];
        }
        
        return -1;
    }
}