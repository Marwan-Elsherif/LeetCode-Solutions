class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                while(nonZeroIdx < nums.length - 1 && nums[nonZeroIdx] == 0) nonZeroIdx++;
                int temp = nums[i];
                nums[i] = nums[nonZeroIdx];
                nums[nonZeroIdx] = temp;
            }
            else nonZeroIdx++;
        }   
    }
}