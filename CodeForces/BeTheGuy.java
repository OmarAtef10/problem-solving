package CodeForces;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class BeTheGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int levels = scanner.nextInt();
        int x = scanner.nextInt();
        int [] xLevels = new int[x];
        for (int i = 0 ;  i < x ; i++){
            xLevels[i]= scanner.nextInt();
        }
        int y = scanner.nextInt();
        int [] yLevels = new int[y];
        for (int i = 0 ;  i < y ; i++){
            yLevels[i]= scanner.nextInt();
        }


        HashSet<Integer> set = new HashSet<>();
        for (Integer i : xLevels){
            set.add(i);
        }
        for (Integer i : yLevels){
            set.add(i);
        }
        if (set.size()!=levels){
            System.out.println("Oh, my keyboard!");
        }else{
            int counter = 1;
            for (int i = 0 ; i < levels ; i++){
                if (!set.contains(counter)){
                    System.out.println("Oh, my keyboard!");
                    return;
                }
                counter++;
            }
            System.out.println("I become the guy.");
        }

    }
}
