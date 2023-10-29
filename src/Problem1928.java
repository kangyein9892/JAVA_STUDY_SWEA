import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;


public class Problem1928 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        for(int t=1; t<=test; t++) {
            String str = reader.readLine();
            String result = new String(Base64.getDecoder().decode(str));
            System.out.println("#" + t + " " + result);
        }
    }
}
