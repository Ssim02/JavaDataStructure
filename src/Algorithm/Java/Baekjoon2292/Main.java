package Algorithm.Java.Baekjoon2292;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 방 수는 층마다 6개씩 증가됨
        // (가야하는 방) - ( 6 * 하나씩 늘어나는 카운터) 이렇게 계산해서 도착할 때까지?
        // 13 = 6 - 6*2 하면 끝나니까 2 + 1 = 3?
        // 58 = 6 - 6*2 - 6*3 -6*4 하면 끝나니까 4 + 1 = 5?
        // 6 * 증가하는 카운터 이런식의 연산을 역산으로 빼면서 마지막에 + 1 하면 가야하는 방 개수 나올듯.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int flag = 0; // 입력값이 1일 경우, 중복 출력을 막기 위한 변수

        // 반례 상황 : 7
        // 다음 층으로 넘어가기 전 마지막 값에서 count가 하나 더 증가하게 되므로, 초기 층(n = 1)을 빼버리면 문제가 해결됨.
        n -= 1;
        while(n > 0) {

            count++; // 연산 결과가 0이 넘더라도 실행은 한 것이므로 일단 먼저 증가시키기
            n -= (6 * count);
        }

        if(flag == 0) System.out.println(count + 1);
    }
}
