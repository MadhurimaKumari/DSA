class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
    //     int sum=0;
    //     for(int i:nums){
    //     String s=String.valueOf(i);
    //         for(int j=0;j<s.length();j++){
    //             if(s.charAt(j)==(char)(digit+'0')){
    //                 sum++;
    //             }
    //         }
    //     }
    //     return sum;
    // 
    


    int ans=0;
    for(int num:nums){
        String s=String.valueOf(num);
        ans+=s.length()-s.replace(String.valueOf(digit),"").length();
    }
    return ans;
    
    }
}