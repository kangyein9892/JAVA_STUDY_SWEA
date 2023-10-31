import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2007 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        for(int t = 1; t <= test; t++ ) {
            int result = 0;
            String str = reader.readLine();
            for(int i = 1; i < 15; i++){
                // 시작이 같을 때
                if(str.charAt(0) == str.charAt(i)){
                    if(str.substring(0, i).equals(str.substring(i, i + i))){
                        result = i;
                        break;
                    }
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
