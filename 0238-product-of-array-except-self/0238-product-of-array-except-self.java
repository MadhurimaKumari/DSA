class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        int r[] =new int[n];
        int prod=1;
        for(int i=n-1;i>=0;i--){
            prod=prod*nums[i];
            r[i]=prod;
        }
        int ans[] =new int[n];
        int l=1;
        for(int i=0;i<n-1;i++){
            int val=l*r[i+1];
            ans[i]=val;
            l=l*nums[i];
        }
        ans[n-1]=l;
        return ans;

    }  
}