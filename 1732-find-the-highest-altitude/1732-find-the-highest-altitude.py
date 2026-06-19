class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        m=0
        curr=0

        for x in gain:
            curr+=x
            m=max(m,curr)
        return m


