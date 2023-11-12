import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1945 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        for (int t = 1; t <= test; t++) {
            int n = Integer.parseInt(reader.readLine());
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;

            while (true) {
                if (n % 2 == 0){
                    n /= 2;
                    a++;
                } else if (n % 3 == 0){
                    n /= 3;
                    b++;
                } else if (n % 5 == 0){
                    n /= 5;
                    c++;
                } else if (n % 7 == 0) {
                    n /= 7;
                    d++;
                } else if (n % 11 == 0) {
                    n /= 11;
                    e++;
                }
                if(n == 1) {
                    break;
                }
            }
            System.out.println("#" + t + " " + a + " " + b + " " + c + " " + d + " " + e );
        }
    }
}
