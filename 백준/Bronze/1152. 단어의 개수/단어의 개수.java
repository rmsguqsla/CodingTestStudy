import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result++;
            }
        }
        if (str.charAt(0) != ' ' && str.charAt(str.length() - 1) != ' ') {
            result++;
        }
        if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ') {
            result--;
        }

        bw.write(String.valueOf(result));
        bw.close();
        br.close();
    }
}