import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<String> stack = new Stack<>();
        
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
             String[] cal = br.readLine().split(" ");
             if (cal[0].equals("push")) {
                 stack.push(cal[1]);
             } else {
                 if (cal[0].equals("pop")) {
                     if (stack.isEmpty()) {
                         sb.append(-1);
                     } else {
                         sb.append(stack.pop());
                     }
                 } else if (cal[0].equals("size")) {
                     sb.append(stack.size());
                 } else if (cal[0].equals("empty")) {
                     if (stack.isEmpty()) {
                         sb.append(1);
                     } else {
                         sb.append(0);
                     }
                 } else if (cal[0].equals("top")) {
                     if (stack.isEmpty()) {
                         sb.append(-1);
                     } else {
                         sb.append(stack.peek());
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