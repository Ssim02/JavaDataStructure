package Algorithm.Java.Baekjoon2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. 라인 전체를 읽어 StringTokenizer에 먹인다
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 2. nextToken()으로 공백 단위로 끊어서 가져온 뒤, int로 변환
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N개의 수 입력받아 배열에 저장
        int[] cards = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st2.nextToken());
        }

        // 3개를 뽑는다 -> 3중 for문 돌려 모든 경우의 수를 계산
        int maxResult = 0; // 조건에 맞는 출력할 값
        int i, j, k = 0;
        for(i = 0; i < N - 2; i++) {
            for(j = i + 1; j < N - 1; j++) {
                for(k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= M && sum > maxResult) {
                        maxResult = sum;
                    }
                }
            }
        }

        System.out.println(maxResult);

    }
}
