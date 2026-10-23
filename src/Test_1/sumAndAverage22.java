package Test_1;

import java.util.Scanner;

public class sumAndAverage22 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];


        }
        avg=sum/arr.length;
        System.out.println("sum of the array is:"+sum);
        System.out.println("sum of the array is:"+avg);

    }
}
