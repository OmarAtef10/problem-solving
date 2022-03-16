import java.util.HashMap;
import java.util.Hashtable;

public class Alien {
    public boolean isAlienSorted(String[] words, String order) {
        // creating hashmap for order string {key-char value - its index}
        Hashtable<Character,Integer> hm = new Hashtable<>();
        for(int i =0;i<order.length();i++){
            char c = order.charAt(i);
            hm.put(c,i);
        }
        for(int i =0;i<words.length-1;i++){
            String s1 = words[i];
            String s2 = words[i+1];
            int j =0,flag=0,flag2=0;
            while(j<s1.length() && j<s2.length() && flag==0){
                int p1 = hm.get(s1.charAt(j));
                int p2 = hm.get(s2.charAt(j));
                j++;
                if(p1==p2) {
                    flag2=1;
                    continue;
                }
                if(p1>p2) return false;
                if(p1<p2) flag =1;
            }
            if(flag ==1) continue;
            if(s1.length()>s2.length() && flag2==1) return false;
        }

        return true;

    }
}
