import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            String string = br.readLine();
            if (string.equals("END")) {
                break;
            } else {
                arrayList.add(string);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = arrayList.get(i).length() - 1; j >= 0; j--) {
                bw.write(arrayList.get(i).charAt(j));
            }
            bw.write('\n');
        }
        bw.close();
        br.close();
    }
}