package Test_1;

import java.util.Scanner;

public class printPrimeNumber18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        //boolean flag=true;
        for (int num = 2; num <= n; num++) {
            boolean flag = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag==true) {
                System.out.print(num+ ",");
            }
        }
    }
}






