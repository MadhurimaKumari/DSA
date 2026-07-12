class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        s=sorted(arr)
        r={}
        curr=1
        for i in s:
            if i not in r:
                r[i]=curr
                curr+=1
        return [r[i] for i in arr]



