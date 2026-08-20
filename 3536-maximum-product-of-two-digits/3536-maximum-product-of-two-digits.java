class Solution {
    public int maxProduct(int n) {
        int digits=0;
        int original=n;
        while(n>0){
            int r=n%10;
            digits++;
            n=n/10;
        }
        int[]arr=new int[digits];
        for(int i=0;i<arr.length;i++){
            arr[i]=original%10;
            original=original/10;
        }
        int max=0;
        for(int j=0;j<arr.length-1;j++){
            int product=0;
            for(int k=j+1;k<arr.length;k++){
                product=arr[j]*arr[k];
                if(max<product){
                    max=product;
                }
            }
        }
        return max;


        
        
    }
}