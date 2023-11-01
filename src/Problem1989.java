import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1989 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        for(int t = 1; t <= test; t++ ) {
            String str = reader.readLine();
            int result = 1;
            for(int i = 0; i <= str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(str.length()-i-1)) { // 맨앞과 맨뒤 비교부터 한칸씩 땡겨서
                    result = 0;
                    break;
                }
            }
            System.out.printf("#%d %d\n", t, result);
        }
    }
}
