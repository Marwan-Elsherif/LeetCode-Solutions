class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false; 
        else{
            int numOfDigits= (int) Math.floor(Math.log10(x)) + 1;
            List<Integer> xAsList = new ArrayList<Integer>();
            while(numOfDigits > 0){
                xAsList.add(x % 10);
                x = x / 10;
                numOfDigits--;
                
            }
            int j = xAsList.size() - 1;
            for (int i = 0; i < xAsList.size(); i++){
                if(xAsList.get(i) != xAsList.get(j)) return false;
                j--;
            }
            return true;
        }
    }
}