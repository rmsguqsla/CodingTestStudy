class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        recursion(numbers, 0, 0, target);
        return answer;
    }
    
    public static void recursion(int[] numbers, int idx, int result, int target) {
        if (idx == numbers.length) {
            if (result == target) {
                answer++;
            }
            return;
        }

        int newResult = result + numbers[idx];

        recursion(numbers, idx + 1, newResult, target);

        newResult = result - numbers[idx];

        recursion(numbers, idx + 1, newResult, target);

        return;
    }
}