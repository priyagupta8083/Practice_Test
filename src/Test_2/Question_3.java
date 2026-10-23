package Test_2;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the numbers: ");
            int arr[]=new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();

            }
            int max=0;
            int second_max=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    second_max=max;
                    max=arr[i];
                }
               else{
                    second_max=arr[i];
                }
            }
            System.out.println(second_max);
    }
}
