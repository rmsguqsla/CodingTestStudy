import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            int[] subArray = new int[j - i + 1];
            int idx = 0;
            for (int l = 0; l < array.length; l++) {
                if (l >= i - 1 && l <= j - 1) {
                    subArray[idx] = array[l];
                    idx++;
                }
            }
            Arrays.sort(subArray);
            result.add(subArray[k - 1]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}