class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> hmap = new HashMap<>();
        
        for (int i=0; i<nums.length; i++){
            if(hmap.containsKey(nums[i])){
                List<Integer> temp = hmap.get(nums[i]);  
                if(Math.abs(i - temp.get(temp.size() - 1)) <=k){
                    return true;
                }
                else{
                    temp.add(i);
                    hmap.put(nums[i], temp);
                }
            }
            else{
                List<Integer> temp = new ArrayList<Integer>(Arrays.asList(i));
                hmap.put(nums[i], temp);
            }
        }
        return false;
        
    }
}