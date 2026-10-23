package Test_1;

import java.util.Scanner;

public class checkPalindrome19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int original =n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(original==n)
            System.out.println("palindrome");

        else
            System.out.println("not palindrome");


    }

}
