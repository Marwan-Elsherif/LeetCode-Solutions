class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n%2 !=0) return false;
        int x = 1;
        boolean found = false;
        while(x <= n/2){
            if(x==n/2){
                found=true;
                break;
            }
            x*=2;
        }
        return found;
    }
}