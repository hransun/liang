package net.xdclass.chapter03.ep4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>  arrayList = new ArrayList<>();
        // add
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("jerry");
        System.out.println(arrayList);

        // del
        arrayList.remove(0);
        System.out.println(arrayList);

        // update
        arrayList.set(0,"marry");
        System.out.println(arrayList);

        // search
        System.out.println("loop method 1");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("loop method 2");
        for (String s : arrayList) {
            System.out.println(s);
        }

        //  init size
        ArrayList<Integer> intArr = new ArrayList<>(3);
        intArr.add(0);
        System.out.println(intArr.size());
        System.out.println(intArr);

        // 2 d array
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        array.add(intArr);
        System.out.println(array);
    }
}
