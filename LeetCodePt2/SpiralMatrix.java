package LeetCodePt2;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>temp = new ArrayList<>();
        for (int i = 0 ; i < matrix.length;i++){
            for (int j = 0 ; j < matrix[i].length;j++){
                temp.add(matrix[i][j]);
            }
        }

        int length = matrix.length;

        ArrayList<Integer>res = new ArrayList<>();
        while (temp.size()>0){
            //1st row elements!!
            for (int i = 0 ; i < length; i ++){
                res.add(temp.get(0));
                temp.remove(temp.get(0));
            }
            //Last Column Elements!!
            for (int i = length-1 ; i < temp.size(); i+=length-1){
                res.add(temp.get(i));
                temp.remove(i);
            }

            if (temp.isEmpty()){
                break;
            }
            length--;

            //Backward From the last Row!!

            for (int i = 0 ; i < length; i ++){
                res.add(temp.get(temp.size()-1));
                temp.remove(temp.size()-1);
            }

            //Up of First Column
            for (int i = temp.size()-1; i >-1 ; i-=length){
                res.add(temp.get(i));
                temp.remove(i);
            }

            length--;
        }

        return res;
    }
    public static void main(String[] args) {

        int [] [] mat = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(mat);
    }
}
