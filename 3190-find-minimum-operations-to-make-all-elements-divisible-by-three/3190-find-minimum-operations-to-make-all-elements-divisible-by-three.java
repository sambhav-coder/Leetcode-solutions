class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int r=nums[i]%3;
            if(r==1){
                nums[i]=nums[i]-1;
                c++;
            }
            else if(r==2){
                nums[i]=nums[i]+1;
                c++;
            }

        }
        return c;
        
    }
}