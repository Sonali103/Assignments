package Generics;

class pairs<k, v> {
    k key;

    v value;

    pairs(k key, v value) {

        this.key = key;
        this.value = value;
    }

    public void setKey(k key) {

        this.key = key;
    }

    public void setValue(v value) {

        this.value = value;
    }

    public k getKey() {

        return this.key;
    }

    public v getValue() {

        return this.value;
    }
}

public class Pair {
    public static void main(String[] args) {

        pairs<String, String> obj = new pairs<String, String>("One", "thomas");
        pairs<String, java.util.Date> obj1 = new pairs<String, java.util.Date>("Today is", new java.util.Date());
        obj.setKey("One");
        obj.setValue("Hello");
        obj1.setKey("Today is");
        obj1.setValue(new java.util.Date());
        System.out.println("Key: " + obj.getKey());
        System.out.println("Value: " + obj.getValue());
        System.out.println("key: " + obj1.getKey());
        System.out.println("Value: " + obj1.getValue());
    }
}