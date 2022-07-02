class Solution {
    public int divisorSubstrings(int num, int k) {
        String numStr = String.valueOf(num);
        int count = 0;
        for(int i=0; i<=numStr.length() - k; i++){
            int tempNum = Integer.valueOf(numStr.substring(i, i+k));
            if(tempNum !=0 && num %  tempNum == 0) count++;
        }
        return count;
    }
}