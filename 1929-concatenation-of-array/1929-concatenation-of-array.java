class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] concate=new int[2*n];
        System.arraycopy(nums,0,concate,0,n);
        System.arraycopy(nums,0,concate,n,n);
        return concate;
        
    }
}