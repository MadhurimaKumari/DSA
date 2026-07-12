class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        s=sorted(nums)
        r=[]
        for i in range(len(nums)):
            if s[i]==target:
                r.append(i)

        return r


