//Find the First Unique Letter
package Test_2;
import java.util.HashMap;


import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
                String s="leatcode";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("First unique letter: " + ch);
                break;
            }
        }
    }
}





