class Solution {
    public int maxArea(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int maxa=0;
        while(l<=r){
            int b=r-l;
            int area=Math.min(nums[l],nums[r])*b;
            maxa=Math.max(maxa,area);
            if(nums[l]<=nums[r]){
                l++;
            }else{
                r--;
            }

        }return maxa;
    }
}