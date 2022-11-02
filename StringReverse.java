package String;
import java.lang.*;
import java.lang.StringBuffer;
import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        String str = "the method return the reversed object on which it was called";
        StringBuffer Buffer= new StringBuffer(str);
        Buffer.reverse();
        System.out.println(Buffer);
    }
}
