package Algorithm.Java.Baekjoon15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 백준 15829번 - Hashing
// 문제에서 주어진 해시함수와 입력으로 주어진 문자열을 사용해 계산한 해시 값을 정수로 출력한다.
public class Main {

    static int count = 0;
    static int tmp = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine()); // 입력으로 주어질 문자열의 길이
        String input = br.readLine();
        long hashValue = 0; // 출력할 해시 값
        long pow = 1; // 거듭제곱을 저장할 변수
        for(int i = 0; i < input.length(); i++) {
           tmp = input.charAt(i) - 'a' + 1;
           hashValue += (tmp * pow) % 1234567891;
           hashValue %= 1234567891;
           pow = (pow * 31) % 1234567891; // 거듭제곱 카운트 증가

        }

        System.out.println(hashValue);
    }

}
