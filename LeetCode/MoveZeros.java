import java.util.ArrayList;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        if(nums.length==1){
            return;
        }
        else{
            ArrayList<Integer> sol = new ArrayList<>();
            for (int i = 0 ; i <nums.length;i++){
                sol.add(nums[i]);
            }
            for (int i = 0 ; i < nums.length;i++){
                if (sol.get(i).equals(0)){
                    sol.remove(sol.get(i));
                    sol.add(0);
                }
            } for (int i = 0 ; i <nums.length;i++){
                nums[i]=sol.get(i);
            }
//            for (int i = 0 ; i <nums.length;i++){
//                System.out.println(nums[i]);;
//            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);

    }
}
