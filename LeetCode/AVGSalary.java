import java.util.ArrayList;
import java.util.Comparator;

public class AVGSalary {

    public static double average(int[] salary) {
        double res = 0.0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int t : salary){
            list.add(t);
        }
        list.sort(Integer::compareTo);
        list.remove(list.get(0));
        list.remove(list.get(list.size()-1));
        for (Integer t : list){
            res+=t;
        }

        res/=list.size();
        return res;
    }

    public static void main(String[] args) {
        int [] avg = {4000,3000,1000,2000};
        System.out.println(AVGSalary.average(avg));
    }
}
