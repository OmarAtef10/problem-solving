public class CountOdds {
    public static int countOdds(int low, int high) {
        double counter = 0;
        if (low%2!=0 && high%2!=0){
            counter = (double)((high-low)/2)+1;
        }else if (low%2!=0 || high%2!=0){
            counter =  (double) (high-low)/2;
        }else{
            counter = (double) (high-low)/2;
        }

        return (int)Math.ceil(counter);

    }

    public static void main(String[] args) {
        int count = CountOdds.countOdds(21,22);
        System.out.println(count);
    }

}
