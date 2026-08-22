class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c1=0;
        int c2=0;
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    c1++;
                    break;
                }
            }
        }
        for(int k=0;k<m;k++){
            for(int p=0;p<n;p++){
                if(nums2[k]==nums1[p]){
                    c2++;
                    break;
                }
            }
        }
        return new int[]{c1,c2};
        

        
    }
}