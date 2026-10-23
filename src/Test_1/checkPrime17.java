package Test_1;

import java.util.Scanner;

public class checkPrime17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i;
        for( i=2;i<=n-i;i++){
            if(n%i==0){
                System.out.println("not prime");
                break;
            }

        }if(i==n)
        System.out.println("prime");

    }
}
