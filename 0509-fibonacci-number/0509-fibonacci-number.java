class Solution {
    public int fib(int N) {
//         if (n <= 1) return n;

//         int a = 0, b = 1;
//         for (int i = 2; i <= n; i++) {
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//         return b;
        
        
  HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();


    if(hm.containsKey(N)){
      return hm.get(N);
    }
    int res;
    if(N<2){
      res=N;
    }else{
      res=fib(N-1)+fib(N-2);
    }
    hm.put(N,res);
    return res;
    }
}
