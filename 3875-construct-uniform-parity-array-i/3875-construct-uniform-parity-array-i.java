class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Agar saare numbers even hain (oddCount == 0)
        // Ya array mein kam se kam ek odd number present hai (oddCount >= 1)
        if (oddCount == 0 || oddCount >= 1) {
            return true;
        }

        return false;
    }
}