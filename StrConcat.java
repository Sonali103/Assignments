package String;

public class StrConcat {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "How are you ?";
        System.out.println("String before joining:");
        System.out.println(str1);
        System.out.println(str2);
        String str3 = str1 + str2;
        System.out.println("String after joining:");
        System.out.println(str3);
    }
}
