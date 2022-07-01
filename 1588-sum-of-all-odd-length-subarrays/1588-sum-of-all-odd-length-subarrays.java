class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        List<Integer> oddList = new ArrayList<>();
        int x = 1;
        while(x<=arr.length){
            oddList.add(x);
            x += 2;
        }
        int ans = 0;
        for(int i=0; i<oddList.size(); i++){
            for(int j=0; j<=arr.length - oddList.get(i); j++){
                for(int k=j; k<j+oddList.get(i); k++)
                    ans += arr[k];
            }
        }
        return ans;
    }
}