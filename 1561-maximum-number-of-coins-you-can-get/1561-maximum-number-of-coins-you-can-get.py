class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        l,r=0,len(piles)
        c=0
        piles.sort()
        for i in range(r//3):
            c+=piles[r-2]
            l+=1
            r-=2
        return c