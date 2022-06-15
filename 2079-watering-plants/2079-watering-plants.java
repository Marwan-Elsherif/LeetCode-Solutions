class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int initCap = capacity;
        int steps = 0;
        for(int i=0; i<plants.length; i++){
            if(plants[i]<=capacity){
                steps++;
                capacity -= plants[i];
            }
            else{
                steps += i * 2 + 1;
                capacity = initCap - plants[i];
            }
        }
        return steps;
    }
}