//Find the first Repeated Roll Number
package Test_2;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

              Scanner sc=new Scanner(System.in);

                System.out.println("Enter the numbers:");
                int arr[] = new int[5];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }

                boolean flag = false;

                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            System.out.println("False");
                            flag = true;
                            break;
                        }
                    }

                    if (flag) {
                        break;
                    }
                }

                if (!flag) {
                    System.out.println("True");
                }

            }
        }
