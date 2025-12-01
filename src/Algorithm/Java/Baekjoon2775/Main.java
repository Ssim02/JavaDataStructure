package Algorithm.Java.Baekjoon2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // Test case

        int[][] apt = new int[15][15]; // 가능한 가장 큰 크기의 아파트 미리 생성

        // 0층의 값은 고정이고, 각 층의 1호실의 값도 1로 고정이므로 미리 초기화시켜놓는다
        for(int i = 1; i < 15; i++) {
            apt[0][i] = i; // 0층의 i호에는 i명이 사는 것이므로
            apt[i][1] = 1; // 각 층의 1호는 1명으로 값이 고정이므로
        }

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // 층 수
            int n = Integer.parseInt(br.readLine()); // 호 수

            for(int j = 1; j < 15; j++) {
                for(int s = 2; s < 15; s++) {
                    apt[j][s] = apt[j][s-1] + apt[j-1][s];
                }
            }

            System.out.println(apt[k][n]);

        }
    }
}
