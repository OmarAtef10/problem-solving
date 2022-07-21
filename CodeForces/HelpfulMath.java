package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String op = scanner.nextLine();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i < op.length();i++){
            if (op.charAt(i)=='+') continue;
            else{
                arrayList.add(Integer.parseInt(String.valueOf(op.charAt(i))));
            }
        }
        arrayList.sort(Integer::compareTo);
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i < arrayList.size();i++){
            builder.append(String.valueOf(arrayList.get(i)));
            if (i<arrayList.size()-1)
                builder.append('+');
        }
        System.out.println(builder.toString());
    }
}
