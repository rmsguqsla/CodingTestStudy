import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            String s = br.readLine();
            int[] result = new int[26];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                    result[s.charAt(j) - 'a']++;
                }
            }

            int max = 0;
            for (int r : result) {
                if (r > max) {
                    max = r;
                }
            }

            int n = 0;
            int answer = 0;
            for (int j = 0; j < 26; j++) {
                if (max == result[j]) {
                    n++;
                    answer = j;
                }
            }

            if (n == 1) {
                sb.append((char)(answer + 'a') + "\n");
            } else {
                sb.append("?\n");
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}