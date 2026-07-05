class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort()
        n=len(nums)
        a=nums[n-1]*nums[n-2]*nums[n-3]
        b=nums[0]*nums[1]*nums[n-1]
        return max(a,b)