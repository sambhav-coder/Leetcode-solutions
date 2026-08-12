class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[]rev=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            rev[i]=nums[nums.length-1-i];
        }
        int[] concate=new int[2*nums.length];
        System.arraycopy(nums,0,concate,0,nums.length);
        System.arraycopy(rev,0,concate,nums.length,rev.length);
        return concate;
        
    }
}