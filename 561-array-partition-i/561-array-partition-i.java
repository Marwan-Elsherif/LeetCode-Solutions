class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int mid = (nums.length)/2;
        for(int i=0; i<nums.length-1; i+=2){ 
            sum += nums[i];
        }
        return sum;
    }
}

// [6,2,6,5,1,2]
// 1,2,2,5,6,6