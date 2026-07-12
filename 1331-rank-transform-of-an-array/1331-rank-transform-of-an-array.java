class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sorted[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sorted[i]=arr[i];
        }
        Arrays.sort(sorted);
        HashMap<Integer,Integer> r=new HashMap<>();
        int curr=1;
        for(int num:sorted){
            if(!r.containsKey(num)){
                r.put(num,curr++);
            }

        }for(int i=0;i<arr.length;i++){
            arr[i]=r.get(arr[i]);
        }return arr;

    }
}