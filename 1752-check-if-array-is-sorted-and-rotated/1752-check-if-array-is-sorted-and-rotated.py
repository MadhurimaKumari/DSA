class Solution:
    def check(self, a: List[int]) -> bool:
        n=len(a)
        c=0
        for i in range(n):
            if(a[i]>a[(i+1)%n]):
                c+=1
        
        return c<=1    