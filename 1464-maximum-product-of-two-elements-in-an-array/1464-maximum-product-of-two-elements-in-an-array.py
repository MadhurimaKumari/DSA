class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n=len(nums)
        nums=sorted(nums)
        maxe=(nums[n-1]-1)*(nums[n-2]-1)
        return maxe