package Algorithm.Java.Baekjoon10989;

import java.io.IOException;
import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine()); // 수의 개수
        int[] array = new int[N];
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            bw.write(String.valueOf(array[i]));
            bw.write("\n");
        }

        bw.flush();
    }
}
