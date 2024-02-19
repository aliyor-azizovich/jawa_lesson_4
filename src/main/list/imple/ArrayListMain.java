package src.main.list.imple;

import src.main.list.GBList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(9);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());

    }
}
