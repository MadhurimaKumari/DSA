class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        # costs.sort()
        # n=0
        # p=0
        # for c in costs:
        #     if c<=coins:
        #         p+=c
        #         if p>coins:
        #             break
        #         n+=1     
        # return n

        costs.sort()
        ans=0
        for cost in costs:
            if cost<=coins:
                ans+=1
                coins-=cost
        return ans

