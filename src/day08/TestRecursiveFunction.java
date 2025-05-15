package day08;

import java.util.Scanner;

public class TestRecursiveFunction {
	public static void main(String args[]) {

        Scanner keyin = new Scanner(System.in);

        int total, num;

        System.out.printf("請輸入一個整數 =>");

        num = keyin.nextInt();

        total = level(num);

        System.out.printf("1*2*3*, ..., %d = %d\n", num, total);

    }

    /* 遞迴函數開始 */

    static int level(int k) {

        int sum;

        if (k <= 1)

            return 1;

        else {

            sum = k * level(k-1);

            System.out.printf("%d * level(%d-1) = %d\n", k, k, sum);

            return sum;

        }

    } /* 遞迴函數結束 */

}
