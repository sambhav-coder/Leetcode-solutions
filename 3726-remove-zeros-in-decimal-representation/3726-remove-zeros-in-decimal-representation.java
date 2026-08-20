class Solution {
    public long removeZeros(long n) {
        long rev=0;
        long rev1=0;
        while(n>0){
            long r=n%10;
            if(r!=0){
                rev=rev*10+r;
            }
            n=n/10;
        }
        while(rev>0){
            long r=rev%10;
            rev1=rev1*10+r;
            rev=rev/10;
        }

        return rev1;
        
    }
}