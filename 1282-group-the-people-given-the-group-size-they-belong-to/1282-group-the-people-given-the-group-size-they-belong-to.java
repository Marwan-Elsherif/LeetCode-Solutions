class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
        List<List<Integer>> answer = new LinkedList<>();
        
        for(int i=0; i<groupSizes.length; i++){
            if(hm.containsKey(groupSizes[i])) {
                List<Integer> temp =  hm.get(groupSizes[i]);
                temp.add(i);
                hm.put(groupSizes[i], temp);
            }
            else{
                List<Integer> temp = new LinkedList<>();
                temp.add(i);
                hm.put(groupSizes[i], temp);
            }
        }
        
        for (Map.Entry<Integer, List<Integer>> e : hm.entrySet()){
            Integer x = e.getKey();
            List<Integer> values = e.getValue();
            for(int i=0; i<values.size();i+=x){
                answer.add(values.subList(i, Math.min(i + x, values.size())));
            }
        }
        return answer;
    }
}