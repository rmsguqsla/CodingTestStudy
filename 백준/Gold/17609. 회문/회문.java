import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static int palindrome (char[] cArr, int p1, int p2, int cnt) {
        while (p1 < p2) {
            if (cArr[p1] == cArr[p2]) {
                p1++;
                p2--;
            } else {
                if (cArr[p1+1] == cArr[p2] || cArr[p1] == cArr[p2-1]) {
                    cnt++;
                    int candidate1 = palindrome(cArr, p1+1, p2, cnt);
                    int candidate2 = palindrome(cArr, p1, p2-1, cnt);
                    cnt = Math.min(candidate1, candidate2);
                    break;
                } else {
                    cnt += 2;
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(br.readLine());
        }

        for (int i = 0; i < T; i++) {
            int cnt = 0;
            String s = list.get(i);
            int p1 = 0;
            int p2 = s.length() - 1;
            char[] cArr = s.toCharArray();

            cnt = palindrome(cArr, p1, p2, cnt);

            if (cnt == 0) {
                bw.write(String.valueOf(0));
            } else if (cnt == 1) {
                bw.write(String.valueOf(1));
            } else {
                bw.write(String.valueOf(2));
            }
            bw.write("\n");
        }

        bw.close();
        br.close();
    }
}