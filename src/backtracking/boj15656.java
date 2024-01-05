package backtracking;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj15656 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, M;
    private static int[] inputNums;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        inputNums = new int[N];

        initInputNums();

        Arrays.sort(inputNums);

        func(0);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void initInputNums() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            inputNums[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void func(int depth) throws IOException{
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                bw.write(arr[i]+" ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = inputNums[i];
            func(depth + 1);
        }
    }
}