package LeetCodePt2;

public class DailyTemperature {

    public int[] dailyTemperatures(int[] temperatures) {

        int [] res = new int [temperatures.length];
        int daysPast = 0;
        for (int i = 0 ; i < temperatures.length;i++){
            for (int j = i ; j < temperatures.length;j++){
                if (temperatures[j]>temperatures[i]){
                    res[i]=daysPast;
                    break;
                }else{
                    daysPast++;
                }
            }
            daysPast=0;
        }

        return res;
    }

}
