import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("");
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(nums[i]);
        }
        bw.write(sum + "");
        bw.close();
        br.close();
    }

}