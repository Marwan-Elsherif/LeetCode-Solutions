class Solution {
    public int searchInsert(int[] nums, int target) {
         return binarySearch(nums, 0, nums.length-1, target);
    }
    int binarySearch(int[] arr, int l, int r, int target){
        if(r>=l){
            int mid = l + (r - l) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) return binarySearch(arr, l, mid-1, target);
            return binarySearch(arr, mid+1 , r, target);
        }
        return l;
    }
}