package codeWars;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(List.of(2, 3, 1, 10,-1));
//        System.out.println(checkSorting(list));

            String s1 = "Seçilən dövr üçün ilkin ərizəniz \"Cari\" növlü olmalıdır.";
        System.out.println(s1);

    }

    public static List<Integer> checkSorting(List<Integer> list) {
        if (list.isEmpty() || list.size()==1){
            return list;
        }

        List<Integer> newList = sortList(list);

        for (int i = 1; i < newList.size(); i++) {
            if (newList.get(i - 1) > newList.get(i)) {
                newList = sortList(newList);
                i = 0;
            }


        }
        return newList;
    }

    public static List<Integer> sortList(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();

        newList.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (newList.get(i - 1) <= list.get(i)) {
                newList.add(list.get(i));
            }
            if (newList.get(i - 1) > list.get(i)) {
                newList.add(i - 1, list.get(i));
            }
        }
        return newList;
    }

    public static String order(String words) {
        if (words == null && words.equals("")) return "";

        Map<Integer, String> map = new TreeMap<>();
        String[] array = words.split(" ");
        for (String s : array) {
            int j = getDigit(s);
            map.put(j, s);
        }
        String result = "";
        for (int i = 0; i < map.size(); i++) {
            result += map.get(i + 1) + " ";
        }
        return result.trim();
    }

    public static int getDigit(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) > 48 && word.charAt(i) < 58) {
                return Character.getNumericValue(word.charAt(i));
            }
        }
        return 0;
    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> integers = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof Integer) {
                integers.add(o);
            }
        }
        return integers;
    }
}
