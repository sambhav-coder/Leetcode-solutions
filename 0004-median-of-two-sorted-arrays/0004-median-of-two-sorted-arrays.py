class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        l=sorted(nums1+nums2)
        n=len(l)
        if(n%2==0):
            return float(l[n//2 -1]+l[n//2])/2
        else:
            return float(l[n//2])
        