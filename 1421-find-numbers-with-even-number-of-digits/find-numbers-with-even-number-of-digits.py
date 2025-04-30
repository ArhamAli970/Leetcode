class Solution:
    def findNumbers(self, nums: List[int]) -> int:
            t=0
            for i in range(len(nums)) :
                if len(str(nums[i]))%2==0:
                      t+=1
            return t
                