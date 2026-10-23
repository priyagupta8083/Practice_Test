package Test_1;

import java.util.Scanner;

public class secondLargestElement25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int secondMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                secondMax = max;
                max = arr[i];
            }
               else if(arr[i]>secondMax){
                   secondMax=arr[i];
            }

        }
        System.out.println("Second largest element is :" +secondMax);
    }
}
