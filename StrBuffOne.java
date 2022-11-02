package String;
import java.lang.*;
import java.lang.StringBuffer;

public class StrBuffOne {
    public static void main(String[] args) {
        System.out.println("Before insert: ");
        StringBuffer str = new StringBuffer("it is used to _ at the specified index position");
        System.out.println(str);
        str.insert(14,"insert text");
        System.out.println("After insert: ");
        System.out.println(str.toString());
    }
}
