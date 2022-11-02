package LeetCodePt3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseArray2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int testCases = scanner.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        while (testCases>0){
            int size = scanner.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            while (size>0){
                temp.add(scanner.nextInt());
                size--;
            }
            int tempRes = 0;
            Collections.reverse(temp);
            for (int i = 0 ; i < temp.size();i++){
                if (i % 2 == 0){
                    tempRes+= Math.pow(temp.get(i),2);
                }else {
                    tempRes-=Math.pow(temp.get(i),2);
                }

            }

            res.add(tempRes);
            testCases--;
        }
        for(int item : res){
            System.out.println(item);
        }
    }
}
