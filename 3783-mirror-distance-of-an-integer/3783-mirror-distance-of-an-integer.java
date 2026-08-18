class Solution {
    public int mirrorDistance(int n) {
        int original=n;
        int reverse=0;
        if(n<10){
            reverse=n;
        }
        else{
            while(n>0){
                int r=n%10;
                reverse=reverse*10+r;
                n=n/10;
            }

        }
        return Math.abs(original-reverse);
        
    }
}