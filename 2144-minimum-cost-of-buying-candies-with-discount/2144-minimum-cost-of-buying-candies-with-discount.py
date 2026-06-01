class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        # cost.sort()
        # t=0
        # i=len(cost) - 1
        # while i>=0:
        #     t+=cost[i]
        #     if i - 1 >= 0:
        #         t+=cost[i - 1]
        #     i-=3
        # return t
        cost.sort()
        res=0
        took=0
        for i in range(len(cost)-1,-1,-1):
            if took==2:
                took=0
            else:
                res+=cost[i]
                took+=1
        return res