class Solution {
    public int largestInteger(int n, int s) {
        return larg_int(n,s);
        
    }
    public static int larg_int(int n,int s) {
		int remainingsum=s;
		int ans=0;
		int current_no=0;
		if(s>9*n) {
			return -1;
		}
		for(int i=1;i<=n;i++) {
			if(remainingsum>=9) {
				current_no=9;
				remainingsum=remainingsum-current_no;
			}
			else {
				current_no=remainingsum;
				remainingsum=0;
			}
			ans=ans*10+current_no;
	
		}
		return ans;
	}
}