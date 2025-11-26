package Algorithm.Java.Baekjoon2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int result = 0; // 출력 기본값(생성자 없을 경우 0을 출력해야 하므로)

        // 1~input까지 루프 돌려 분해합 조건을 만족하는 생성자 찾기
        for(int i = 1; i <= input; i++) {
            int temp = i;
            int decompositionSum = temp; // 분해합
            while(temp > 0) {
                decompositionSum += temp % 10;
                temp /= 10; // 1의 자리를 날린다.
            }
            // 생성자를 찾았는지 확인
            if (decompositionSum == input) {
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}
