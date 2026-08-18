class Solution {
    public int countDigits(int n) {
        int original=n;
        int count=0;
        if(n<10){
            return 1;
        }
        else{
            while(n>0){
                int r=n%10;
                if(original%r==0){
                    count++;
                }
                n=n/10;
            }
            return count;
        }
        
    }
}