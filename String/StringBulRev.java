package String;
import java.lang.*;
public class StringBulRev {
    public static void main(String[]args){
        String input="the method return the reversed object on which it was called";
        StringBuilder input1=new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
}
