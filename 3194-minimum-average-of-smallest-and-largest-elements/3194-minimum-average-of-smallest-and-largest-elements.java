class Solution {
    public double minimumAverage(int[] nums) {
        double[]avr=new double[nums.length/2];
        ArrayList<Integer>nums1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            nums1.add(nums[i]);
        }
        for(int j=0;j<avr.length;j++){
            Collections.sort(nums1);
            avr[j]=(nums1.get(0)+nums1.get(nums1.size()-1))/2.0;
            nums1.remove(nums1.size()-1);
            nums1.remove(0);
        }
        Arrays.sort(avr);
        return avr[0];
        
    }
}