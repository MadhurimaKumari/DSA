class Solution {
    public double[] convertTemperature(double cel) {
        
        double kel=cel+273.15;
        double far=cel*1.80+32.00;
        double ans[]={kel,far};
        return ans;

        

    }
}