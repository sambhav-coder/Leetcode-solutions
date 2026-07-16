class Solution {
    public void rotate(int[] nums, int k) {
        Rotate(nums,k);
        
    }
    public static void Rotate(int[]arr,int k) {
		int n=arr.length;
		k=k%n;//3%7=3
		//starting n-k element ko reverse krna hai
		Reverse(arr,0,n-k-1);
		// last k element ko reverse
		Reverse(arr,n-k,n-1);
		// entire array reverse
		Reverse(arr,0,n-1);
	}
	public static void Reverse(int[]arr,int i,int j) {
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}