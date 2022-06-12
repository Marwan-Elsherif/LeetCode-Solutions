class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> init =  new LinkedList<Integer>();
        init.add(1);
        for(int i=0; i<rowIndex; i++){
            List<Integer> temp =  new LinkedList<Integer>();
            temp.add(1);
             for(int j=0; j<init.size()-1; j++){
                temp.add(init.get(j)+init.get(j+1));
             }
            temp.add(1);
            init = temp;
        }
        return init;
    }
}