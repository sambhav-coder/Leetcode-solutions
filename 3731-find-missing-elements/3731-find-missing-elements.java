class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int diff=0;
            if(nums[i+1]-nums[i]!=1){
                diff=nums[i+1]-nums[i];
                for(int j=nums[i];j<nums[i+1];j++){
                    if(j!=nums[i]){
                        arr.add(j);
                    }
                }
            }
        }
        return arr;
    }
}