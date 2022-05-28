class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length - 1; j++){
                if(nums[j] == val){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }         
            }
        }
        for(int i=0; i<nums.length; i++) if(nums[i] != val) k++;
        return k;
    }
}