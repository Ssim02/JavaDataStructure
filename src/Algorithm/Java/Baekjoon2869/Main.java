package Algorithm.Java.Baekjoon2869;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 미터
        int B = Integer.parseInt(st.nextToken()); // 밤에 내려가는 미터
        int V = Integer.parseInt(st.nextToken()); // 목적지

        int days = 0; // 걸린 일 수

        // 시간 = 거리 / 속도 이용
        days = (V - B) / (A - B);
        // 나머지가 남는 경우(하루 더 올라가야 함)
        if ((V - B) % (A - B) != 0)
            days++;


        System.out.println(days);
    }
}
