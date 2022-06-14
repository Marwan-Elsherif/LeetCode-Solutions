class Solution {
    public int numberOfBeams(String[] bank) {
        // int[] nums = new int[bank.length];
        List<Integer> nums = new LinkedList<>();
        for (int j=0; j<bank.length; j++){
            int cnt = 0;
            for (int i=0; i<bank[j].length(); i++){
                if(bank[j].charAt(i) == '1') cnt++;
            }
            if(cnt != 0) nums.add(cnt);
        }
        int prod = 0;
        if(nums.size() == 1) return 0;
        for (int i=0; i<nums.size()-1; i++){
            prod += nums.get(i) * nums.get(i+1);
        }
        return prod;
    }
}