import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1288 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        for (int t = 1; t <= test; t++) {
            int n = Integer.parseInt(reader.readLine());
            int num = 0;
            boolean[] numbers = new boolean[10];
            int count = 0;

            while (count < 10) {
                num += n;
                String str_n = Integer.toString(num);
                for (int i = 0; i < str_n.length(); i++){
                    int number = Character.getNumericValue(str_n.charAt(i));
                    if(!numbers[number]) {
                        numbers[number] = true;
                        count += 1;
                    }
                }

            }
            System.out.println("#" + t + " " + num);
        }
    }
}
