package Generics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public class RdAss {

    public static void main(String[] args) {
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        map.put(1, 1.0);
        map.put(2, 2.0);
        map.put(3, 3.0);
        map.put(4, 4.0);
        map.put(5, 5.0);
        map.put(6, 6.0);
        map.put(7, 7.0);
        map.put(8, 8.0);
        map.put(9, 9.0);
        map.put(10, 10.0);
        System.out.println("Size of map is:- "
                + map.size());
        System.out.println(map);
        Set s = map.keySet();
        System.out.println(s);
        Collection c = map.keySet();
        System.out.println(c);
        Set e = map.entrySet();
        System.out.println(e);
    }}