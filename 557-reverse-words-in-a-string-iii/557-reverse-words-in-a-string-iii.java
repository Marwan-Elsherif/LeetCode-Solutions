class Solution {
    public String reverseWords(String s) {
        
        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                while(!stack.empty()){
                    sb.append(stack.pop());
                }  
                sb.append(' ');
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}