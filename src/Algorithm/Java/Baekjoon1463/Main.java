package Algorithm.Java.Baekjoon1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // dp 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1]; // 각 N의 최소 연산 횟수를 저장할 배열

        dp[1] = 0; // 1은 연산횟수 0으로 고정
        for(int i = 2; i < dp.length; i++) {
            // 1을 빼는 경우
            dp[i] = dp[i-1] + 1; // 연산을 수행한 것이므로 1을 더한다
            // System.out.println("연산 수행 : dp[" + i + "] - 1, " + " 수행 후 결과 : dp[" + i + "] = " + dp[i]);

            // 2로 나누는 경우
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2] + 1); // 둘 중 작은값, 즉 연산횟수가 더 적은 걸로 저장
                // System.out.println("연산 수행 : dp[" + i + "] / 2, " + " 수행 후 결과 : dp[" + i + "] = " + dp[i]);
            }

            // 3으로 나누는 경우
            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
                // System.out.println("연산 수행 : dp[" + i + "] / 3, " + " 수행 후 결과 : dp[" + i + "] = " + dp[i]);
            }
        }
        System.out.println(dp[N]); // 위 루프가 끝나면 N까지 수들의 연산 횟수 최솟값이 전부 배열에 들어가 있게 될 것이므로
    }

}
