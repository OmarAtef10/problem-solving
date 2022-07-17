package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String instructions = scanner.nextLine();
        ArrayList<Character> insarray = new ArrayList<>();
        for (int i = 0 ; i < instructions.length();i++){
            insarray.add(instructions.charAt(i));
        }
        int pos=0;
        while (insarray.size()>0){
            if (insarray.get(0) == word.charAt(pos)){
                pos++;
            }
            insarray.remove(0);
        }
        System.out.println(pos+1);
    }
}
