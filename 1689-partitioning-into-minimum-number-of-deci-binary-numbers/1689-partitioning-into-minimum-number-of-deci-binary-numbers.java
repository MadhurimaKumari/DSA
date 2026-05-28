class Solution {
    public int minPartitions(String n) {
        // int ans=0;
        // for(int i=0;i<n.length();++i){
        //     ans=Math.max(ans,n.charAt(i)-'0');
        // }return ans;
        for(int i=9;i>0;i--){
            if(n.contains(String.valueOf(i))){
                return i;
            }
        }
        return 0;

    }
}