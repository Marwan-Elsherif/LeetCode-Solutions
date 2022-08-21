class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m-1 , sec = n-1 ,i = m+n-1;
        while(sec >=0 ){
            if(first >=0 && nums1[first] > nums2[sec]){
                nums1[i--] = nums1[first--];
            } 
            else{
                nums1[i--] = nums2[sec--];
            }
        }
       }
    }
