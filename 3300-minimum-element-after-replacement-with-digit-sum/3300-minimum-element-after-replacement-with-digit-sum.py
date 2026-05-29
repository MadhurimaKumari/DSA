class Solution:
    def minElement(self, nums: List[int]) -> int:
        ans=float('inf')
        for num in nums:
            d=0
            while num:
                d+=num%10
                num//=10
            ans=min(ans,d)
        return ans
