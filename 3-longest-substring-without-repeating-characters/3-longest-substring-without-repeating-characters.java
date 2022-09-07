class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hashSet = new HashSet<Character>();
        int windowStart = 0;
        int maxLength = 0;
        
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++){
            
            if(hashSet.contains(s.charAt(windowEnd))){
                while(hashSet.contains(s.charAt(windowEnd))){
                    hashSet.remove(s.charAt(windowStart));
                    windowStart++;
                }             
                hashSet.add(s.charAt(windowEnd));
            }
            else{
                hashSet.add(s.charAt(windowEnd));
            }
            maxLength = Math.max(maxLength, windowEnd-windowStart+1);
            
        }
        return maxLength;
    }
}