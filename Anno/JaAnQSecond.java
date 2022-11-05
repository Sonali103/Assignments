package Anno;
import java.lang.annotation.Annotation;
import java.lang.annotation.*;
import java.util.ArrayList;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{

    int Author_id() ;
    String Author_name ();
    String Supervisior ();
    int Date ();
    double Time ();
    int Version ();
    String Description();
}
@info(Author_id = 1, Author_name = "ApjKalam",Supervisior = "",Date=15/10/2015,Time = 12,Version = 1,Description="")
class Developers{
   /* int Author_id ;
    String Author_name ;
    String Supervisior ;
    String Date ;
    double Time ;
    int Version ;
*/
    String Book;

    public Developers(String book) {
        Book = book;
    }
}
public class JaAnQSecond {
    public static void main(String[] args) {
        Developers dev= new Developers("Wings of fire");

        Class  c=dev.getClass();
       Annotation a=c.getAnnotation(info.class);

        info f=(info)a;
        System.out.println(f.Author_id ());
        System.out.println(f.Author_name());
        System.out.println(f.Supervisior());
        System.out.println(f.Date());
        System.out.println(f.Time());
        System.out.println(f.Version());

    }
}