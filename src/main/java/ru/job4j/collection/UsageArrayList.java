package ru.job4j.collection;

import java.util.ArrayList;

/**
 * 0. Коллекции, ArrayList, List, Обобщения[#257522]
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        list.add("Petr");
        list.add("Ivan");
        list.add("Stepan");
        for (Object name : list) {
            System.out.println(name);
        }
    }
}