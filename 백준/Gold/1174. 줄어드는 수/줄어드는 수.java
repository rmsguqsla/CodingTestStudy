import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static long solution(int N, int cnt, long num) {
        long max = 9876543210L;

        if (num - 1 > max) {
            return -1;
        }

        if (cnt == N) {
            return num - 1;
        }

        int idx = getUpIdx(num);

        if (idx == -1) {
            cnt++;
            num++;
        } else {
            num = skip(num, idx);
        }

        return solution(N, cnt, num);
    }

    public static long skip(long num, int idx) {
        char[] cArr = String.valueOf(num).toCharArray();

        if (cArr[idx] - '0' == 9) { // 980 -> ... -> 987 -> 988 -> 990 -> 1000
            return (long)Math.pow(10, cArr.length);
        } else {
            cArr[idx] = (char) (cArr[idx] + 1);
            cArr[idx + 1] = '0';
            return Long.parseLong(new String(cArr));
        }
    }

    public static int getUpIdx(long num) {
        char[] cArr = String.valueOf(num).toCharArray();

        for (int i = 0; i < cArr.length - 1; i++) {
            char c1 = cArr[i];
            char c2 = cArr[i + 1];
            if (c1 <= c2) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        long result = solution(N, 0, 0);
        bw.write(result + "");
        bw.close();
        br.close();
    }
}