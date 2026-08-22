class Solution(object):
    def elevatorRequests(self, n, requests):
        """
        :type n: int
        :type requests: List[int]
        :rtype: int
        """
        sum=requests[0]
        for i in range(1,len(requests)):
            sum+=abs(requests[i]-requests[i-1])
        return sum
        