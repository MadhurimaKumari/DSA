class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        # ans=[]
        # for num in nums:
        #     idx=abs(num)-1
        #     if nums[idx]<0:
        #         ans.append(abs(num))
        #     else:
        #         nums[idx]=-nums[idx]
        # return ans

        arr=[0]*(len(nums)+1)
        res=[]
        for num in nums:
            if arr[num] == 0:
                arr[num] = 1
            else:
                res.append(num)
        return res