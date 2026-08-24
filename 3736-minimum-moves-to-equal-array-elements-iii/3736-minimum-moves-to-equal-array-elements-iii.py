class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        c=0
        for i in range(len(nums)):
            c+=nums[-1]-nums[i]
        return c