class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]merge=new int[m+n];
        System.arraycopy(nums1,0,merge,0,n);
        System.arraycopy(nums2,0,merge,n,m);
        sort(merge);
        int lo=0;
        int hi=merge.length-1;
        double median=0.0;
        if(merge.length%2==0){
            double k=(merge[(lo+hi)/2])+(merge[((lo+hi)/2)+1]);
            median=k/2;
        }
        else{
            median=merge[(lo+hi)/2];
        }
        return median;
        
    }
    public int[] sort(int[]merge){
        for(int i=1;i<merge.length;i++){
            for(int j=0;j<merge.length-i;j++){
                if(merge[j]>merge[j+1]){
                    int temp=merge[j];
                    merge[j]=merge[j+1];
                    merge[j+1]=temp;
                }
            }
            
        }
        return merge;
    }
}