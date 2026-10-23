package Test_2;
//Question 1:- A college is organizing a programming competition. Each participate receives a uniqe
//seat number form 0to n. However, one seat number is missing from the registration list.


import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int seat[] = new int[n];
        int sum = 0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            seat[i] = sc.nextInt();
            sum += seat[i];
        }

        int total = (n + 1) * (n + 2) / 2;
        int missing = sum-total;

        System.out.println( missing);

        sc.close();
    }
}






