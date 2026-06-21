class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Arrays.sort(costs);
        // int ans=0;
        // for( int cost:costs){
        //     if (cost<=coins){
        //         ans+=1;
        //         coins-=cost;
        //     }
        // }
        // return ans;

        Arrays.sort(costs);
        int n=0;
        int p=0;
        for( int c:costs){
            if (c<=coins){
                 p+=c;
                if (p>coins){
                     break;
                }
                n+=1;
            }
        }     
        return n;
    }
}