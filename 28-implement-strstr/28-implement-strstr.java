class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        int idx=0;
        boolean found=false;
        for(int i=0; i<haystack.length() - needle.length() +1; i++){        
            for(int j=0; j<needle.length() && haystack.charAt(i+needle.length()-1) == needle.charAt(needle.length()-1); j++){
                if(haystack.charAt(i+j) == needle.charAt(j)){
                    found=true;
                }
                else{
                    found=false;
                    break;
                }
            }
            if(found) return i;
        }
        return -1;
    }
}