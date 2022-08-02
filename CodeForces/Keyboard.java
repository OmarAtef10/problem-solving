package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        ArrayList<Character> row1 = new ArrayList<Character>();
        ArrayList<Character> row2 = new ArrayList<Character>();
        ArrayList<Character> row3 = new ArrayList<Character>();

        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl;";
        String s3 = "zxcvbnm,./";
        for (int i = 0; i < s1.length(); i++) {
            row1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            row2.add(s2.charAt(i));
        }
        for (int i = 0; i < s3.length(); i++) {
            row3.add(s3.charAt(i));
        }

        Scanner scanner = new Scanner(System.in);
        char dir = scanner.nextLine().charAt(0);
        String word = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (dir == 'R') {
                if (row1.contains(word.charAt(i))) {
                    res.append(row1.get(row1.indexOf(word.charAt(i)) - 1));

                } else if (row2.contains(word.charAt(i))) {
                    res.append(row2.get(row2.indexOf(word.charAt(i)) - 1));

                } else if (row3.contains(word.charAt(i))) {
                    res.append(row3.get(row3.indexOf(word.charAt(i)) - 1));

                }
            } else {
                if (row1.contains(word.charAt(i))) {
                    res.append(row1.get(row1.indexOf(word.charAt(i)) + 1));

                } else if (row2.contains(word.charAt(i))) {
                    res.append(row2.get(row2.indexOf(word.charAt(i)) + 1));

                } else if (row3.contains(word.charAt(i))) {
                    res.append(row3.get(row3.indexOf(word.charAt(i)) + 1));
                }
            }


        }
        System.out.println(res.toString());
    }

}

