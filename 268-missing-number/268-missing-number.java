class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int mainResult = 0;
        int supposedResult = len * (len+1) /2; 
        for (int i=0; i<len; i++){
            mainResult += nums[i];
        }        
        return supposedResult - mainResult;
        
    }
}