import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<String> list = new LinkedList<>();
        
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
             String[] cal = br.readLine().split(" ");
             if (cal[0].equals("push")) {
                 list.add(cal[1]);
             } else {
                 if (cal[0].equals("pop")) {
                     if (list.isEmpty()) {
                         sb.append(-1);
                     } else {
                         sb.append(list.get(0));
                         list.remove(0);
                     }
                 } else if (cal[0].equals("size")) {
                     sb.append(list.size());
                 } else if (cal[0].equals("empty")) {
                     if (list.isEmpty()) {
                         sb.append(1);
                     } else {
                         sb.append(0);
                     }
                 } else if (cal[0].equals("front")) {
                     if (list.isEmpty()) {
                         sb.append(-1);
                     } else {
                         sb.append(list.get(0));
                     }
                 }else if (cal[0].equals("back")) {
                     if (list.isEmpty()) {
                         sb.append(-1);
                     } else {
                         sb.append(list.get(list.size()-1));
                     }
                 }
                 sb.append("\n");
             }
        }

        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}