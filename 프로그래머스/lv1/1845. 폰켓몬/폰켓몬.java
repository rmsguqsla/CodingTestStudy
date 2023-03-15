import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int selectCnt = nums.length / 2;
        int answer = 0;
        if (selectCnt <= map.size()) {
            answer = selectCnt;
        } else {
            answer = map.size();
        }
        return answer;
    }
}