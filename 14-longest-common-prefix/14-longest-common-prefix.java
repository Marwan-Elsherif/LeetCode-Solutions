class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++){
            char curr = strs[0].charAt(i);
            boolean isGood=true;
            for(int j=0; j<strs.length; j++){
                if(i<strs[j].length()){
                    if(strs[j].charAt(i) != curr){
                        isGood=false;
                        break;
                    }
                }
                else{
                    return builder.toString();
                } 
        }
            if(isGood) builder.append(curr);
            else return builder.toString();
    }
    return builder.toString();
}
}