package String;
import java.lang.*;
import java.lang.StringBuffer;

public class StrBuffSecond {
  public static void main(String[] args) {
      System.out.println("StringBuffer");
      StringBuffer sbf=new StringBuffer("StringBuffer ");

      sbf.append(" is a peer class of a string");


      sbf.append(" that provides much of");

      sbf.append(" the functionality of strings");
      System.out.println("Result after appending is:" +sbf);
  }
}
