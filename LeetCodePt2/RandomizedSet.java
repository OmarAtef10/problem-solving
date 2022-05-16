package LeetCodePt2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

class RandomizedSet {

    private Hashtable<Integer, Integer> map;
    Random r = new Random();
    ArrayList<Integer> list;

    public RandomizedSet() {

        map = new Hashtable<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            map.put(val, list.size());
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int lastElem = list.get(list.size() - 1);
            int index = map.get(val);
            list.set(index, lastElem);
            map.put(lastElem,index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {

        return list.get(r.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */