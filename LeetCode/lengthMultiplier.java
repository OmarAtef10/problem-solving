import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;

public class lengthMultiplier {


    public static int maxProduct(String[] words) {

        ArrayList<String> arrayList = new ArrayList<>();
        for (String word : words) {
            arrayList.add(word);
        }

        arrayList.sort((a, b) -> Integer.compare(b.length(), a.length()));
        ArrayList<String>superDuper = new ArrayList<>();
        for (String word : arrayList){
            char tempArray[] = word.toCharArray();
            Arrays.sort(tempArray);
            superDuper.add(new String(tempArray));
        }
        System.out.println(superDuper);


        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for (String word : superDuper) {
            hashtable.put(word, word.length());
        }

        int max = 0;
        for (int i = 0; i < superDuper.size(); i++) {
            String temp = superDuper.get(i);
            for (String word : hashtable.keySet()) {
                if (temp == word) {
                    continue;
                } else {
                    for (int x = 0 ; x < temp.length();x++){
                        if (word.contains(String.valueOf(temp.charAt(x)))){
                            break;
                        }else if (x==temp.length()-1){
                            int res = temp.length() * word.length();
                            max = Math.max(max, res);
                        }
                    }

                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        String[] words2 = {"a","aa","aaa"};
        String[] words3 = {"a","ab","abc","d","cd","bcd","abcd"};


        int res =  maxProduct(words3);
        System.out.println(res);
    }
}
