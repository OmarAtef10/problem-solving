package CodeForces;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        String[] words = song.split("(WUB)+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.equals("WUB")) {
                sb.append(word);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
