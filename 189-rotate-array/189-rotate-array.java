class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] temp = new int[k];
        int idx = 0;
        if(k==n || n==1 || k==0) return;
        k = k%n;
        for(int i=(n-k) % n; i<n; i++){
            temp[idx] = nums[i];
            idx++;
        }
        for(int i=n-k-1; i>=0; i--){
            nums[(i+k) % n] = nums[i];
        }
        for(int i=0; i<k; i++){
            nums[i] = temp[i];
        }
    }
}