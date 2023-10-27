import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1204 {
    public static void main(String args[]) throws Exception
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int test = Integer.parseInt(reader.readLine());

    for(int t = 1; t <= test; t++)
    {
        // 테스트 케이스의 번호
        int testNumber = Integer.parseInt(reader.readLine());

        // 점수의 개수를 저장하는 배열 생성
        StringTokenizer st = new StringTokenizer(reader.readLine()," ");
        int[] scores = new int[101];

        // 배열에 학생 명수 저장 (ex: 1번에는 1점 학생 명수 저장)
        for(int i =  0; i < 1000; i++){
            scores[Integer.parseInt(st.nextToken())]++;
        }

        // 최빈수 구하기
        int max = 0; // 빈도수
        int maxNum = 0; // 최빈값
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= max){
                max = scores[i];
                maxNum = i;
            }
        }

        System.out.println("#" + testNumber + " " + maxNum);
    }
}
}

