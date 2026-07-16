class Solution {
    public int trap(int[] height) {
        int []leftmax= new int [height.length];
		int[]rightmax=new int[height.length];
		int[]minimum=new int[height.length];
        leftMax(height,leftmax);
		rightmax(height,rightmax);
		minimum(minimum,leftmax,rightmax);

        return water(height,minimum);
    }
    public static void leftMax(int[]height,int[]leftmax) {
		leftmax[0]=height[0];
		for(int i=1;i<height.length;i++) {
			if(height[i]>leftmax[i-1]) {
				leftmax[i]=height[i];
			}
			else {
				leftmax[i]=leftmax[i-1];
			}	
		}
		
	}
    public static void rightmax(int[]height,int[]rightmax) {
		int n=height.length;
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			if(height[i]>rightmax[i+1]) {
				rightmax[i]=height[i];
			}
			else {
				rightmax[i]=rightmax[i+1];
			}
		}
		
	}
    	public static void minimum(int[]minimum,int[]leftmax,int[]rightmax) {
		int n=minimum.length;
		for(int i=0;i<n;i++) {
			minimum[i]=Math.min(leftmax[i],rightmax[i]);
		}
		
		
		
	}
    public static int water(int[]height,int[]minimum) {
		int total=0;
		for(int i=0;i<height.length;i++) {
			int water=(minimum[i]-height[i]);
			total=total+water;
		}
		return(total);
		
		
	}

}