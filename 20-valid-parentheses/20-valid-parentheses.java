class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            Character currChar = s.charAt(i);
            if(currChar == '(' || currChar == '[' || currChar == '{'){
                stack.push(currChar);
            }
            else{
                if(!stack.isEmpty()){
                    Character poppedChar = stack.peek();  
                    if(poppedChar == '(' && currChar != ')') return false;
                    else if(poppedChar == '[' && currChar != ']') return false;
                    else if(poppedChar == '{' && currChar != '}') return false;
                    else stack.pop();
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }
}