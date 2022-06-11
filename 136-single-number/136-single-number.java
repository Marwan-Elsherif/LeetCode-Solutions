class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer> ();
        int sum = 0;
        int supposedSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);                
                supposedSum += nums[i]*2;
            }   
            sum += nums[i];
        }
        return supposedSum - sum;
    }
}