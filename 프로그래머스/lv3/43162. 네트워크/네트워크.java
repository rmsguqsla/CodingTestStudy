import java.util.Stack;
class Solution {
    public int solution(int n, int[][] computers) {
        int result = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                visited[i] = true;

                while (!stack.isEmpty()) {
                    int cur = stack.pop();

                    for (int j = 0; j < computers[cur].length; j++) {
                        if (computers[cur][j] == 1 && !visited[j]) {
                            stack.push(j);
                            visited[j] = true;
                        }
                    }
                }
                result++;
            }
        }

        return result;
    }
}