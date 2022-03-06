public class FloodFill {

    public void solve(int[][] image, int sr, int sc, int newColor,int cur)
    {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[sr].length || image[sr][sc]==newColor || image[sr][sc]!=cur)
            return;
        image[sr][sc]=newColor;
        solve(image,sr+1,sc,newColor,cur);
        solve(image,sr,sc+1,newColor,cur);
        solve(image,sr-1,sc,newColor,cur);
        solve(image,sr,sc-1,newColor,cur);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        solve(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
}
