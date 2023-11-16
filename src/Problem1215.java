import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Problem1215 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int num = Integer.parseInt(reader.readLine());
            int result = 0;
            String[][] arr = new String[8][8];
            // st = new StringTokenizer(reader.readLine());

            for(int i = 0; i < 8; i++){
                String st = reader.readLine();
                for (int j = 0; j < 8; j++){
                    arr[i][j] = String.valueOf(st.charAt(j));
                }
            }

            String str_x = "";

            for(int i = 0; i < 8; i++){
                for (int j = 0; j <= 8-num; j++){
                    for(int k = 0; k < num; k ++) {
                        str_x += arr[i][j + k];
                        if(str_x.length() == num) {
                            StringBuffer sb = new StringBuffer(str_x);
                            String str_reverse = sb.reverse().toString();
                            if(str_x.equals(str_reverse)) {
                                result ++;
                            }
                            str_x = "";
                        }
                    }

                }
            }

            String str_y = "";

            for(int i = 0; i < 8; i++){
                for (int j = 0; j <= 8-num; j++){
                    for(int k = 0; k < num; k++) {
                        str_y += arr[j + k][i];
                        if(str_y.length() == num) {
                            StringBuffer sb = new StringBuffer(str_y);
                            String str_reverse = sb.reverse().toString();
                            if(str_y.equals(str_reverse)) {
                                result ++;
                            }
                            str_y = "";
                        }
                    }
                }
            }


            System.out.println("#" + t + " " + result);
        }
    }
}
