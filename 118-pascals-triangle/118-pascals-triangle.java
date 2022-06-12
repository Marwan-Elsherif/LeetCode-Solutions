class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new LinkedList<>();
        List<Integer> init =  new LinkedList<Integer>();
        init.add(1);
        answer.add(init);
        for(int i=0; i<numRows-1; i++){
            List<Integer> temp =  new LinkedList<Integer>();
            temp.add(1);
             for(int j=0; j<init.size()-1; j++){
                temp.add(init.get(j)+init.get(j+1));
             }
            temp.add(1);
            answer.add(temp);
            init = temp;
        }
        return answer;
    }
}