class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> rom = new HashMap<Character, Integer>();
        rom.put('I', 1);
        rom.put('V', 5);
        rom.put('X', 10);
        rom.put('L', 50);
        rom.put('C', 100);
        rom.put('D', 500);
        rom.put('M', 1000);       
        
        int ans=0, i=0;
        while(i < s.length() - 1){
            if(rom.get(s.charAt(i)) < rom.get(s.charAt(i+1))){
                ans = ans - rom.get(s.charAt(i));
                i++;
            }
            else{
                ans = ans + rom.get(s.charAt(i)) ;
                i++;
        }
    }
        return ans + rom.get(s.charAt(s.length() - 1));
    }
}