import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nowTimeString = br.readLine();
        String throwTimeString = br.readLine();

        int[] nowTime = Arrays.stream(nowTimeString.split(":"))
            .mapToInt(Integer::parseInt).toArray();

        int[] throwTime = Arrays.stream(throwTimeString.split(":"))
            .mapToInt(Integer::parseInt).toArray();

        int[] waitTime = new int[3];

        for (int i = 0; i < 3; i++) {
            waitTime[i] = throwTime[i] - nowTime[i];
        }

        if (nowTimeString.equals(throwTimeString)) {
            bw.write("24:00:00");
        } else {
            if (waitTime[2] < 0) {
                waitTime[2] += 60;
                waitTime[1]--;
            }
            if (waitTime[1] < 0) {
                waitTime[1] += 60;
                waitTime[0]--;
            }
            if (waitTime[0] < 0) {
                waitTime[0] += 24;
            }
            bw.write(String.format("%02d:%02d:%02d", waitTime[0], waitTime[1], waitTime[2]));

        }
        bw.close();
        br.close();
    }
}