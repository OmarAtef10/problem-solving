import javax.swing.plaf.IconUIResource;
import java.util.*;

public class twoGram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            char c = '\0';
            c = (in.next().charAt(0));
            arr[i] = Character.toString(c);
        }
//        for (int i = 0; i < num; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println();

        String[] arr2 = new String[num - 1];

        for (int i = 0; i < num; i++) {
            if (i == num - 1)
                break;
            String two = arr[i] + arr[i + 1];
            arr2[i] = two;
        }
//
//        for (int i = 0; i < num - 1; i++) {
//            System.out.println(arr2[i]);
//        }
        Hashtable<String, Integer> Grams = new Hashtable<>();
        for (int i = 0; i < num - 1; i++) {
            String g = arr2[i];
            int flag = 0;
            for (int j = i; j < num - 1; j++) {
                if (g.equals(arr2[j])) {
                    flag++;
                }
            }
            if (Grams.containsKey(g)) {
                continue;
            }
            Grams.put(arr2[i], flag);

        }
//        System.out.println("\nHashMap Values");
//        for (String val : Grams.keySet()) {
//            System.out.println(val + " " + Grams.get(val));
//        }
        int max = Collections.max(Grams.values());
        for (String val : Grams.keySet()) {
            if (Grams.get(val) == max) {
                System.out.println(val);
                break;
            }
        }

    }
}
