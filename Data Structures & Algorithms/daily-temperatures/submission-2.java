class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] result = new int[size];
        for(int i = 0; i < size; i++) {
            int j = i + 1;
            int final_value = 1;
            while(j < size) {
                if(temperatures[j] <= temperatures[i]) {
                    final_value += 1;
                    j++;
                } else {
                    result[i] = final_value;
                    break;
                }
            }
        }
        return result;
    }
}
