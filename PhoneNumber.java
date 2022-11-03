package Collection;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class PhoneNumber {
    public static void main(String[] args) {
        number n1 = new number(647528916);
        number n2 = new number(647528919);
        number n3 = new number(647528915);
        Contact c1 = new Contact("a", "agmail.com", 'f');
        Contact c2 = new Contact("b", "bgmail.com", 'f');
        Contact c3 = new Contact("c", "cgmail.com", 'f');
        TreeMap<number, Contact> t1 = new TreeMap<number, Contact>(new Sortbyphno());
        t1.put(n1, c1);
        t1.put(n2, c2);
        t1.put(n3, c3);
        System.out.println(t1);
        Set s1 = t1.keySet();
        System.out.println(s1);
        Collection s2 = t1.values();
        System.out.println(s2);
        Set s3 = t1.entrySet();
        System.out.println(s3);
    }
}
