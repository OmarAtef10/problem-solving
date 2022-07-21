package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class AntonLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='{'||word.charAt(i)==' '||word.charAt(i)==','||word.charAt(i)=='}' ){
                continue;
            }else{
                builder.append(word.charAt(i));
            }

        }
        for (int i = 0; i < builder.length(); i++) {
            if (!set.contains(builder.charAt(i))) {
                set.add(builder.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}
