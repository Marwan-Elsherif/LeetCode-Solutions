class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        Map<Integer, Set<Integer>> hmap = new HashMap<>();
        
        for(int i=0; i<logs.length; i++){
            if(hmap.containsKey(logs[i][0])){
                Set<Integer> tempSet = hmap.get(logs[i][0]);
                if(tempSet.add(logs[i][1])){
                    hmap.put(logs[i][0], tempSet);
                    // ans[logs[i][0]+1]++;
                }                    
            }
            else{
                Set<Integer> hset = new HashSet<Integer>();
                hset.add(logs[i][1]);
                hmap.put(logs[i][0], hset);
                // ans[logs[i][0] + 1]++;
            }   
        }
        hmap.forEach((key, v) ->  ans[v.size()-1]++);
        return ans;
    }
}