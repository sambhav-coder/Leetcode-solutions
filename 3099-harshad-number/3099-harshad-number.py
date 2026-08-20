class Solution(object):
    def sumOfTheDigitsOfHarshadNumber(self, x):
        sum=0
        original=x
        while x>0:
            r=x%10
            sum+=r
            x=x//10
        if original%sum==0:
            return sum
        else:
            return -1
        