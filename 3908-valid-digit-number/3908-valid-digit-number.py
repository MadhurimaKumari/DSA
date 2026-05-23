class Solution:
    def validDigit(self, n: int, x: int) -> bool:
        a=str(n)
        b=str(x)
        if a[0]!=b and b in a:
            return True
        else: return False


        