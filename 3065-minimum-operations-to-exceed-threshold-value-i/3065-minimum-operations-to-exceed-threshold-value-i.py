class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count=0
        for i in range(0,len(nums)):
            if nums[i]<k:
                count+=1
        return count
        