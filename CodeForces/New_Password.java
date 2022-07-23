package CodeForces;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class New_Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int distinct = scanner.nextInt();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        ArrayList<Character> arrayList = new ArrayList<>();
        while (distinct > 0) {
            while (true){
                Random random = new Random();
                char letter = letters[random.nextInt(letters.length)];
                if (!arrayList.contains(letter)){
                    arrayList.add(letter);
                    break;
                }
            }
            distinct--;
        }
        StringBuilder builder = new StringBuilder();
        while (len>0){
            builder.append(arrayList.get(len%arrayList.size()));
            len--;
        }
        System.out.println(builder.toString());
    }
}
