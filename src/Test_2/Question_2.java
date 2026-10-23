//Question 2: Find the Best Pair of Students
package Test_2;

import java.util.Scanner;

public class Question_2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array: ");
            int arr[] = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();


            }

            System.out.println("Enter the target:");
            int target = sc.nextInt();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target)
                        System.out.println(j+","+i);
                    break;

                }

            }
        }
}
