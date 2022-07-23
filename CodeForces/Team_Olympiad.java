package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Team_Olympiad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsNum = scanner.nextInt();
        ArrayList<Integer> students = new ArrayList<>();
        for (int i = 0; i < studentsNum; i++)
            students.add(scanner.nextInt());
        int oneCount = 0, twoCount = 0, threeCount = 0;
        ArrayList<Integer>oneIndex = new ArrayList<>();
        ArrayList<Integer>twoIndex = new ArrayList<>();
        ArrayList<Integer>threeIndex = new ArrayList<>();

        for (int i = 0 ; i < students.size();i++) {
            if (students.get(i) == 1) {
                oneCount++;
                oneIndex.add(i+1);
            } else if (students.get(i) == 2) {
                twoCount++;
                twoIndex.add(i+1);
            } else {
                threeCount++;
                threeIndex.add(i+1);
            }
        }
        int teams = 0 ;
        if (studentsNum>=3 && oneCount>=1 && twoCount>=1 && threeCount>=1){
            teams = Math.min(oneCount,twoCount);
            teams = Math.min(teams,threeCount);
        }
        System.out.println(teams);
        while (teams>0){
            System.out.println(oneIndex.get(0)+" "+twoIndex.get(0)+" "+threeIndex.get(0));
            oneIndex.remove(oneIndex.get(0));
            twoIndex.remove(twoIndex.get(0));
            threeIndex.remove(threeIndex.get(0));
            teams--;
        }
    }
}
