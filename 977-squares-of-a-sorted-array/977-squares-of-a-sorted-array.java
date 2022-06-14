class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        
        int i=0, pos=0, neg=-1, idx=0;
        while(i<nums.length){
            if(nums[i]<0) i++;
            else break;
        }
        pos=i;
        neg=i-1;

        while(pos<nums.length && idx<nums.length){
            if(neg>=0){
                if(nums[pos]*nums[pos] < nums[neg] * nums[neg]) {
                    answer[idx] = nums[pos] * nums[pos];
                    pos++;
                }
                else{
                    answer[idx] = nums[neg] * nums[neg];
                    neg--;
                } 
            }
            else{
                answer[idx] = nums[pos] * nums[pos];
                pos++;
            }
            idx++;
        }
        while(neg>=0){
            answer[idx] = nums[neg] * nums[neg];
            neg--;
            idx++;
        }
        return answer;
    }
}