public class nearestPoint {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i < points.length ; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            if (x==x1 || y==y1){
                int dist = Math.abs(x-x1)+Math.abs(y-y1);
                if (dist<min){
                    index=i;
                    min=dist;
                }
            }
        }

        return index;
    }
}
