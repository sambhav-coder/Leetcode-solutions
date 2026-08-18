class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0;
        int rev2=0;
        int orig=num;
        while(num>0){
            int r=num%10;
            rev1=rev1*10+r;
            num=num/10;
         }
        while(rev1>0){
            int r=rev1%10;
            rev2=rev2*10+r;
            rev1=rev1/10;

        }
        if(rev2==orig){
            return true;
        }
        else{
            return false;
        }
       

        
    }
}