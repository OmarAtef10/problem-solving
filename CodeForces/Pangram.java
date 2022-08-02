package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Pangram {
    static class Letter {
        char letter;
        boolean visited;

        public Letter(char letter) {
            this.letter = letter;
            this.visited = false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Letter> letters = new ArrayList<Letter>();
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            Letter letter = new Letter(alphabet);
            letters.add(letter);
        }
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
        if (length < letters.size()) {
            System.out.println("NO");
        } else {
            char[] sentenceArray = sentence.toCharArray();
            Arrays.sort(sentenceArray);
            for (Character character : sentence.toCharArray()) {
                for (Letter letter : letters) {
                    if (letter.letter == character) {
                        letter.visited = true;
                    }
                }
            }
            for (Letter letter : letters) {
                if (!letter.visited) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }

    }
}
