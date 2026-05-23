class Solution:
    def validDigit(self, n: int, x: int) -> bool:
        a=str(n)
        b=str(x)
        return a[0]!=b and b in a
          


        