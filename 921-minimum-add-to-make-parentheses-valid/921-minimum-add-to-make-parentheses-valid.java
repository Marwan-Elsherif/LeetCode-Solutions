class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0, balance = 0;
        for (int i = 0; i < s.length(); i++) {
            balance += s.charAt(i) == '(' ? 1 : -1;
            if (balance == -1) {
                ans++;
                balance++;
            }
        }
        return ans + balance;
    }
}