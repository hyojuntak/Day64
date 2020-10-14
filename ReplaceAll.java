package JC.Day64;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int [] A = new int[N];
        int [] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);Arrays.sort(B);
        
        int j = 5;
        for (int i = 0; i < K; i++) {
            int temp = 0; 
            temp = A[i];
            A[i] = B[j-1];
            B[j-1] = temp;
            --j;
        }

        int sum=0;

        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
        }

        System.out.println(sum);

    }
}
