class Solution {
    public int maxCoins(int[] piles) {
        int l=0;
        int r=piles.length;
        int c=0;
        Arrays.sort(piles);
        for(int i=0;i<piles.length/3;i++){
            c+=piles[r-2];
            r-=2;
        }return c;
    }
}