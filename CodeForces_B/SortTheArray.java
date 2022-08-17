package CodeForces_B;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        int left = -1, right = -1;
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        for (int i = 0; i < size; i++) {
            if (a[i] != b[i]) {
                left = i;
                break;
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (a[i] != b[i]) {
                right = i;
                break;
            }
        }
        if (left == -1) {
            System.out.println("yes\n1 1");
            return;
        }

        reverse(a, left, right);
        for (int i = 0; i < size; i++) {
            if (a[i] != b[i]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        System.out.println((left + 1) + " " + (right + 1));

    }

    static void reverse(int [] a,int l,int r) {
        int [] t = new int[a.length];

        //t[0] t[1] 2 3 4 5
        //t[5] t[4] 3 2 1 0
        for(int i=l,j=r; i<=r; i++,j--) {
            t[i] = a[j];
        }

        if (r + 1 - l >= 0) System.arraycopy(t, l, a, l, r + 1 - l);
    }
}
