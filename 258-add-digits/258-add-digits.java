class Solution {
    public int addDigits(int num) {
        
        int numCopy = num;
        while(true){
            int result = 0;
            while(numCopy > 0){
                result += numCopy % 10;
                numCopy /=10;
            }
            if(result<=9) return result;
            numCopy=result;
        }
    }
}