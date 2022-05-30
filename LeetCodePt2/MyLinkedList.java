package LeetCodePt2;

import java.util.ArrayList;
import java.util.List;

class MyLinkedList {
    List<Integer> list;

    public MyLinkedList() {
        list = new ArrayList<>();

    }

    public int get(int index) {
        if (index < 0 || index >= list.size())
            return -1;
        return list.get(index);
    }

    public void addAtHead(int val) {
        list.add(0, val);

    }

    public void addAtTail(int val) {
        list.add(list.size(), val);
    }

    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= list.size())
            list.add(index, val);
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < list.size())
            list.remove(index);
    }


    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(2);
        list.deleteAtIndex(1);
        list.addAtHead(2);
        list.addAtHead(7);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(5);
        list.addAtTail(5);
        list.get(5);
        list.deleteAtIndex(6);
        list.deleteAtIndex(4);

    }
}


