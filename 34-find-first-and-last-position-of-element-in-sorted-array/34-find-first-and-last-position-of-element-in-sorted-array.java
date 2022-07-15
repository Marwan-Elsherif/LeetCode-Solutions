class Solution {
    public int[] searchRange(int[] nums, int target) {
        int idx = binarySearch(nums, 0, nums.length-1, target);
        if(idx == -1){
            int[] ans = {-1, -1};
            return ans;
        }
        else{
            int up = idx;
            int down = idx;
            while(up < nums.length && nums[up] == target) up++;
            while(down >=0 && nums[down] == target) down--;
            int[] ans = {down+1, up-1};
            return ans;
        }
    }
    
    private int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            if (arr[mid] == x)
                return mid;
  
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}