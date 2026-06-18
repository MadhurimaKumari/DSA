class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        ans=0
        for num in set(nums):
            if nums.count(num)==1:
                ans+=num
        return ans