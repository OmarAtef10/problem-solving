package CodeForces_B;

import java.util.ArrayList;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] query = new String[3];
        for (int i = 0; i < 3; i++) {
            query[i] = scanner.nextLine();
        }
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        char[] wins = new char[3];
        char[] loses = new char[3];
        char bigBoi, smallBoi;
        for (int i = 0; i < 3; i++) {
            if (query[i].charAt(1) == '>') {
                wins[i] = query[i].charAt(0);
                loses[i] = query[i].charAt(2);
            } else {
                wins[i] = query[i].charAt(2);
                loses[i] = query[i].charAt(0);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (wins[i] == 'A')
                aCount++;
            else if (wins[i] == 'B')
                bCount++;
            else if (wins[i] == 'C')
                cCount++;
        }
        if (aCount > bCount && aCount > cCount) {
            bigBoi = 'A';
        } else if (bCount > aCount && bCount > cCount) {
            bigBoi = 'B';
        } else {
            bigBoi = 'C';
        }
        aCount = 0;
        bCount = 0;
        cCount = 0;
        for (int i = 0; i < 3; i++) {
            if (loses[i] == 'A')
                aCount++;
            else if (loses[i] == 'B')
                bCount++;
            else if (loses[i] == 'C')
                cCount++;
        }
        if (aCount > bCount && aCount > cCount) {
            smallBoi = 'A';
        } else if (bCount > aCount && bCount > cCount) {
            smallBoi = 'B';
        } else {
            smallBoi = 'C';
        }
        if (bigBoi == smallBoi) {
            System.out.println("Impossible");
        } else {
            ArrayList<Character> pAns = new ArrayList<>();
            pAns.add(smallBoi);
            pAns.add(' ');
            pAns.add(bigBoi);
            if (!pAns.contains('A')) {
                pAns.set(1, 'A');
            } else if (!pAns.contains('B')) {
                pAns.set(1, 'B');
            } else {
                pAns.set(1, 'C');
            }
            StringBuilder ans = new StringBuilder();
            for (Character c : pAns) {
                ans.append(c);
            }
            System.out.println(ans.toString());
        }
    }
}
