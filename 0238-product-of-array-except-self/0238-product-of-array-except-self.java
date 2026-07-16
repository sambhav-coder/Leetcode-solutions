class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []leftproduct=new int[nums.length];
		int[]rightproduct=new int[nums.length];
		int[]product=new int [nums.length];
		leftproduct(nums,leftproduct);
		rightproduct(nums,rightproduct);
        return(product(product,leftproduct,rightproduct));
		
        
    }
    public static void leftproduct(int[]arr,int[]leftproduct) {
		leftproduct[0]=1;
		for(int i=1;i<arr.length;i++) {
			leftproduct[i]=leftproduct[i-1]*arr[i-1];
		}
	}
	public static void rightproduct(int[]arr,int[]rightproduct) {
		int n=arr.length;
		rightproduct[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			rightproduct[i]=rightproduct[i+1]*arr[i+1];
		}
		
	}
	public static int[] product(int[]product,int[]leftproduct,int[]rightproduct) {
		for(int i=0;i<leftproduct.length;i++) {
			product[i]=leftproduct[i]*rightproduct[i];
		}
        return product;
	}
}