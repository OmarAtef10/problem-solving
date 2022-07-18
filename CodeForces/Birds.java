package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Birds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        ArrayList<Integer> boxes = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            boxes.add(scanner.nextInt());
        }
        int shots = scanner.nextInt();
        while (shots > 0) {
            int index = scanner.nextInt();
            int kill = scanner.nextInt();
            int left = kill - 1;
            int right = boxes.get(index - 1) - kill;
            if (index == 1 && length==1){
                boxes.set(0,0);
                break;
            }
            if (index == 1) {
                boxes.set(0, 0);
                boxes.set(1, boxes.get(1) + right);
            }
            else if (index == length) {
                boxes.set(length - 1, 0);
                boxes.set(length - 2, boxes.get(length - 2) + left);
            } else {
                boxes.set(index-2,boxes.get(index-2)+left);
                boxes.set(index,boxes.get(index)+right);
                boxes.set(index-1,0);
            }

            shots--;
        }
        for (Integer i : boxes){
            System.out.println(i);
        }
    }
}
