package String;
import java.lang.*;
public class StrBulInsert {
    public static void main(String[] args) {
        System.out.println("Before insert: ");
        StringBuilder str = new StringBuilder("it is used to _ at the specified index position");
        System.out.println(str);
        str.insert(14,"insert text");
        System.out.println("After insert: ");
        System.out.println(str.toString());
    }
}
