package LeetCodePt2;

import java.util.Collections;
import java.util.Hashtable;

public class ClosestToOrigin {

    public static int[][] kClosest(int[][] points, int k) {

        Hashtable<int[], Double> hashtable = new Hashtable<>();
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            double res = CalcDistance(x, y);
            hashtable.put(new int[]{x, y}, res);

        }
        int i = 0;
        int [] [] finalRes = new int[k][2];
        while (k>0){
           int [] res = new int [2];
           double min = Integer.MAX_VALUE;
           for (int [] keys : hashtable.keySet()){
               if (hashtable.get(keys)<min){
                   min = hashtable.get(keys);
                   res = keys;
               }
           }
           hashtable.remove(res);
           finalRes[i]=res;
           i++;
           k--;
       }


        return finalRes;
    }

    public static double CalcDistance(int x, int y) {
        int xSQ = Math.abs(x)*Math.abs(x);
        int ySQ = Math.abs(y)*Math.abs(y);
        int res = xSQ+ySQ;
        return Math.sqrt(res);
    }

    public static void main(String[] args) {
        int [] [] points = {{3,3},{5,-1},{-2,4}};
        kClosest(points,2);

    }
}
