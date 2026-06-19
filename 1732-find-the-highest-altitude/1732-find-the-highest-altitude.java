class Solution {
    public int largestAltitude(int[] gain) {
        // int[] a=new int[gain.length+1];
        // a[0]=0;
        // for(int i=1;i<=gain.length;i++){
        //     a[i]=a[i-1]+gain[i-1];

        // }
        // int maxe=a[0];
        // for(int i=1;i<=gain.length;i++){
        //     if(maxe<a[i]){
        //         maxe=a[i];
        //     }

        // }return maxe;

        int max=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(sum>max){
                max=sum;
            }
            
        }return max;
    
    }
}