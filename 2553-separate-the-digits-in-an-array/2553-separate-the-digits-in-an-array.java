class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int original=nums[i];
            if(nums[i]>=10){
                ArrayList<Integer> temp=new ArrayList<>();
                while(original>0){
                    int r=original%10;
                    temp.add(r);
                    original=original/10;
                }
                for(int j=temp.size()-1;j>=0;j--){
                    list.add(temp.get(j));
                }

            }
            else{
                list.add(nums[i]);
            }
        }
        
        int[]arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;

        
    }
}