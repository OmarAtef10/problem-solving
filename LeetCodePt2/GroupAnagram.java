package LeetCodePt2;

import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        HashSet<List<String>> anagrams = new HashSet<>();

        String[] temp = strs.clone();
        for (int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            temp[i]=new String(s);
            System.out.println(temp[i]);
        }


        for (int i = 0 ; i < strs.length;i++){
            ArrayList<String>temparr = new ArrayList<>();
            temparr.add(strs[i]);
            for (int j = 0 ; j < strs.length; j++){
                if (temp[i].equals(temp[j]) && strs[i]!=strs[j]){
                    temparr.add(strs[j]);
                }
            }
            Collections.sort(temparr);
            if (anagrams.contains(temparr)){
                continue;
            }
            anagrams.add(temparr);
            res.add(temparr);
        }
        return res;
    }


    public static void main(String[] args) {

        String [] strs = {"eat","tea","tan","ate","nat","bat"};

        groupAnagrams(strs);
    }



}
