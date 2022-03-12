import java.util.ArrayList;

public class isArithSeq {

    public boolean canMakeArithmeticProgression(int[] arr) {
        ArrayList <Integer> sorted  = new ArrayList<>();
        for (int i = 0 ; i < arr.length;i++){
                sorted.add(arr[i]);
        }
        sorted.sort(Integer::compareTo);
        int def=sorted.get(0)- sorted.get(1);
        int prev = def;
        for (int i = 2 ; i < sorted.size();i++){
            def=sorted.get(i-1)- sorted.get(i);
            if (def!=prev){
                return false;
            }
        }
        return true;
    }
}
