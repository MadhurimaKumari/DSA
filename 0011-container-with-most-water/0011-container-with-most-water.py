class Solution:
    def maxArea(self, height: List[int]) -> int:
    
        i = 0
        j = len(height)-1
        max = 0
        while i != j:
            x = j - i
            if height[i] <= height[j]:
                area = height[i] * x
                i += 1
            else:
                area = height[j] * x
                j -= 1
            if area > max:
                max = area
        return max