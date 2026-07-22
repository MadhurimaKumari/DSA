class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        total=0
        for i in range(len(timeSeries)-1):
            gap=timeSeries[i+1]-timeSeries[i]
            if gap>=duration:
                total+=duration
            else:
                total+=gap
        total+=duration
        return total