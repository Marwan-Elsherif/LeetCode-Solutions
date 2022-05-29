class Solution {
    public int lengthOfLastWord(String s) {
        int idx=0;
        int count = 0;
        boolean toCancel= false;
        while(idx != s.length()){
            if(s.charAt(idx) != ' ' && !toCancel){
                count++;
            } 
            else if(s.charAt(idx) == ' ' && !toCancel){
                toCancel=true;
            } 
            else if(s.charAt(idx) != ' ' && toCancel){
                count=1;
                toCancel= false;
            }
            idx++;
        }
        return count;
    }
}