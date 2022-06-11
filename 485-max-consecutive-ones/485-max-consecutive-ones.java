class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int onesCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                onesCount++;
                ans = onesCount>ans? onesCount:ans;
            }
            else onesCount = 0;
        }
        return ans;
    }
}