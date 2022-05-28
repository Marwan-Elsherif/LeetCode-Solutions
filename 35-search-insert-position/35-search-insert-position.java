class Solution {
    public int searchInsert(int[] nums, int target) {
        int midIdx = nums.length/2;
        int mid = nums[midIdx];
        if(mid == target) return midIdx;
        else if(target > mid){
            for(int i=midIdx; i<nums.length - 1; i++){
                if(nums[i] == target) return i;
                else if(nums[i] < target && target <= nums[i+1]) return i+1; 
            }
            return nums.length;
        }
        else{
            for(int i=0; i<midIdx; i++){
                if(nums[i] == target) return i;
                else if(nums[i] < target && target < nums[i+1]) return i+1; 
            }
            return 0;
        }
    }
}