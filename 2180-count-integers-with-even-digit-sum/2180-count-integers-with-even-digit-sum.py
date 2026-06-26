class Solution:
    def countEven(self, num: int) -> int:
        c=0
        for i in range(1,num+1):
            sume=0
            temp=i
            while temp:
                sume+=temp%10
                temp//=10
            if sume%2==0:
                c+=1

        return c
