class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            int lo=0;
            int hi=arr2.length-1;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(Math.abs(arr1[i]-arr2[mid])<=d){
                    break;
                }
                else if(arr2[mid]<arr1[i]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
            if(lo>hi){
                c++;
            }
        }
        return c;

        
    }
}