class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        int pivotCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot)
                small.add(nums[i]);
            else if(nums[i] > pivot)
                large.add(nums[i]);
            else
                pivotCount++;
        }
        
        int i=0;
        for(int j=0; j < small.size(); j++)
            nums[i++] = small.get(j);

        for(int j=0; j < pivotCount; j++)
            nums[i++] = pivot;

        for(int j=0; j < large.size(); j++)
            nums[i++] = large.get(j);  
        
        return nums;
    }
}