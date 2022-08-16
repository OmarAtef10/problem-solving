package CodeForces_B;

import java.util.ArrayList;
import java.util.Scanner;

public class decoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine();
        ArrayList<Character> characters = new ArrayList<Character>();
        ArrayList<Character> res = new ArrayList<>();

        for (Character c : word.toCharArray()) {
            characters.add(c);
            res.add(' ');
        }
        boolean right = true;
        boolean left = false;
        int index = 0;
        while (!characters.isEmpty()) {
            if (right) {
                left = true;
                right = false;
                res.set(len - 1, characters.get(characters.size() - 1));
                characters.remove(characters.size() - 1);
                len--;
            } else {
                left = false;
                right = true;
                res.set(index, characters.get(characters.size() - 1));
                characters.remove(characters.size() - 1);
                index++;

            }
        }
        StringBuilder builder = new StringBuilder();
        for (Character c : res){
            builder.append(c);
        }
        System.out.println(builder);
    }
}
