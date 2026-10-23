package Test_1;

import java.util.Scanner;

public class countEvenOdd24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even number is:"+even);
        System.out.println("even number is:"+odd);


    }
}
