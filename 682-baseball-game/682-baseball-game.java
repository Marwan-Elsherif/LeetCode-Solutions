class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list = new LinkedList<>();
        int sum=0;
        for(int i=0; i<ops.length; i++){       
            if(ops[i].equals("+")){
                list.add(Integer.valueOf(list.get((list.size()-1))) + Integer.valueOf(list.get((list.size()-2))));
            }
            else if(ops[i].equals("D")){
                list.add(Integer.valueOf(list.get((list.size()-1)) * 2));
            }
            else if(ops[i].equals("C")){
                list.remove(list.size() - 1);
            }
            else list.add(Integer.valueOf(ops[i]));
        }
        for(Integer x: list) sum +=x;
        return sum;
    }
}