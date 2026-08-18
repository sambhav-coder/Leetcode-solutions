class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int orig=x;
        int sum=0;
        while(x>0){
            int r=x%10;
            sum+=r;
            x=x/10;
        }
        if(orig%sum==0){
            return sum;
        }
        else{
            return -1;
        }
        
    }
}