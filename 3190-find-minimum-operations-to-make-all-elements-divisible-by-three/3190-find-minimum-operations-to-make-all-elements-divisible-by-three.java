class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int r=nums[i]%3;
            if(r==1 || r==4 || r==7){
                nums[i]=nums[i]-1;
                c++;
            }
            else if(r==2 || r==5 || r==8){
                nums[i]=nums[i]+1;
                c++;
            }

        }
        return c;
        
    }
}