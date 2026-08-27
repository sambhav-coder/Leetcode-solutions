class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            sum=nums[i]+nums[nums.length-1-i];
            arr.add(sum);
        }
        
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }
}