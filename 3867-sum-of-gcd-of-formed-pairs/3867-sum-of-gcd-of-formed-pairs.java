class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        ArrayList<Integer> pre=new ArrayList<>();
        int mx=0;

        for(int x:nums){
            mx=Math.max(mx,x);
            pre.add(gcd(mx,x));
        }

        Collections.sort(pre);

        int i=0;
        int j=pre.size()-1;
        long ans=0;

        while(i<j){
            ans+=gcd(pre.get(i),pre.get(j));
            i++;
            j--;
        }

        return ans;
    }
}