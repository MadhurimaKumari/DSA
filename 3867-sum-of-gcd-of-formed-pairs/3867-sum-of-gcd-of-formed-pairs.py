class Solution:
    def gcd(self,a, b):
        while b!=0:
            temp=b
            b=a%b
            a=temp
        return a
    
    def gcdSum(self, nums: list[int]) -> int:
        
        pre=[]
        mx=-inf
        for x in nums:
            mx=max(mx,x)
            pre.append(self.gcd(mx,x))

        pre.sort()

        i=0
        j=len(pre)-1
        ans=0

        while i<j:
            ans+=self.gcd(pre[i],pre[j])
            i+=1
            j-=1

        return ans


