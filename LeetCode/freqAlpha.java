import java.util.Hashtable;

public class freqAlpha {
    public static String freqAlphabets(String s) {
        Hashtable<String,String> db = new Hashtable<>();
        db.put("1","a");
        db.put("2","b");
        db.put("3","c");
        db.put("4","d");
        db.put("5","e");
        db.put("6","f");
        db.put("7","g");
        db.put("8","h");
        db.put("9","i");
        db.put("10#","j");
        db.put("11#","k");
        db.put("12#","l");
        db.put("13#","m");
        db.put("14#","n");
        db.put("15#","o");
        db.put("16#","p");
        db.put("17#","q");
        db.put("18#","r");
        db.put("19#","s");
        db.put("20#","t");
        db.put("21#","u");
        db.put("22#","v");
        db.put("23#","w");
        db.put("24#","x");
        db.put("25#","y");
        db.put("26#","z");

        String res = "";

        for (int i = 0 ; i < s.length();i++){
            if (i<s.length()-2 && db.containsKey(s.substring(i,i+3))){
                String temp = s.substring(i,i+3);
                res+=db.get(temp);
                i+=2;
            }else{
                res+=db.get(String.valueOf(s.charAt(i)));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("1326#"));
    }
}
