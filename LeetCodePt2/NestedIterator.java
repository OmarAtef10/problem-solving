package LeetCodePt2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

interface NestedInteger {

              // @return true if this NestedInteger holds a single integer, rather than a nested list.
              public boolean isInteger();

              // @return the single integer that this NestedInteger holds, if it holds a single integer
              // Return null if this NestedInteger holds a nested list
              public Integer getInteger();

              // @return the nested list that this NestedInteger holds, if it holds a nested list
              // Return empty list if this NestedInteger holds a single integer
              public List<NestedInteger> getList();
 }
public class NestedIterator implements Iterator<Integer> {

    ArrayList<Integer> res;
    int count;
    public NestedIterator(List<NestedInteger> nestedList) {
        res = new ArrayList<>();
        count = 0;
        for (NestedInteger integer:nestedList){
            fillList(integer);
        }
    }
    @Override
    public Integer next() {
        return res.get(count++);
    }

    @Override
    public boolean hasNext() {
        return count<res.size();
    }

    public void fillList(NestedInteger nestedInteger){
        if (nestedInteger.isInteger()){
            res.add(nestedInteger.getInteger());
        }else{
            for (NestedInteger nestedInteger1 : nestedInteger.getList()){
                fillList(nestedInteger1);
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */