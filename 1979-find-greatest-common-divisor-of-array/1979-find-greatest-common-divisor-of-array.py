class Solution:
    def findGCD(self, nums: List[int]) -> int:
        mn=nums[0]
        mx=nums[0]
        for num in nums:
            mn=min(mn,num)
            mx=max(mx,num)
        while mx!=0:
            temp=mx
            mx=mn%mx
            mn=temp
        return mn