class Solution:
    def angleClock(self, hr: int, mint: int) -> float:
        h=(hr%12)*30+mint*0.5
        m=mint*6

        diff=abs(h-m)

        return min(diff,360-diff)