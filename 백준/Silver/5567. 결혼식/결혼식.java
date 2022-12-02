import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 친구
// 친구의 친구
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int result = 0;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] friends = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            friends[a][b] = 1;
            friends[b][a] = 1;
        }
        boolean[] visited = new boolean[n + 1];

        Queue<Integer> queue = new LinkedList();
        queue.offer(1);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (!visited[cur] && cur != 1) {
                result++;
                visited[cur] = true;
            }

            for (int i = 1; i <= n; i++) {
                if (!visited[i] && friends[cur][i] == 1 && (friends[i][1] == 1 || friends[cur][1] == 1)) {
                    queue.offer(i);
                }
            }
        }

        bw.write(result + "");
        bw.close();
        br.close();
    }
}