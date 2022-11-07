package Java11;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;
public class Java3
{
    public static void main(String[] args)
    {
        String str = new String("A ,quick ,brown, fox, jump, over, the, lazy, dog");
        ArrayList<String> s1 = new ArrayList<>(Arrays.asList(str.split(",")));
        System.out.println(s1);
        System.out.println(s1.get(1));
        System.out.println(s1.get(5));
    }
}