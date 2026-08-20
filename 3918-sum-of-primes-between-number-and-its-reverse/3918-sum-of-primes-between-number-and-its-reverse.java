class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev1=0;
        int original=n;
        while(n>0){
            int r=n%10;
            rev1=rev1*10+r;
            n=n/10;
        }
        int start = Math.min(original, rev1);
        int end = Math.max(original, rev1);
        int sum=0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
        
    }
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}