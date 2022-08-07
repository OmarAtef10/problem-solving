package CodeForces;

import java.util.Hashtable;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goals = scanner.nextInt();
        scanner.nextLine();
        Hashtable<String, Integer> goalsTable = new Hashtable<String, Integer>();
        for(int i = 0 ; i < goals ; i++){
            String team = scanner.nextLine();
            if (goalsTable.containsKey(team)) {
                goalsTable.put(team, goalsTable.get(team) + 1);
            } else {
                goalsTable.put(team, 1);
            }
        }
        int max = -1;
        String maxTeam = "";
        for (String key : goalsTable.keySet()) {
            if (goalsTable.get(key) > max) {
                max = goalsTable.get(key);
                maxTeam = key;
            }
        }
        System.out.println(maxTeam);
    }
}
