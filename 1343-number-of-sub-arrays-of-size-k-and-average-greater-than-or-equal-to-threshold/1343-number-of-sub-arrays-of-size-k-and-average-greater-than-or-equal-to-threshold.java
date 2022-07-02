class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        for(int i=0; i<=arr.length - k; i++){
            if(i==0){
                for(int j=0; j<k; j++) sum += arr[j];
            }
            else sum = sum - arr[i-1] + arr[i+k-1];     
            if(sum/k >= threshold) count++;
        }
        return count;
    }
}