package Anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.*;
import java.util.ArrayList;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
{
    int Sequence();
}
class MyCla
{
    @Execute(Sequence=2)
    public void myMethod1()
    {
        System.out.println("Method 1");
    }
    @Execute(Sequence=1)
    public void myMethod2()
    {
        System.out.println("Method 2");
    }
    @Execute(Sequence=3)
    public void myMethod3()
    {
        System.out.println("Method 3");
    }

}
public class MyClass
{
    public static void main(String[] args) throws Exception
    {
        MyCla c=new MyCla();
        Method m=c.getClass().getMethod("myMethod2");
        Method m1=c.getClass().getMethod("myMethod1");
        Method m2=c.getClass().getMethod("myMethod3");
        Execute e=m.getAnnotation(Execute.class);
        Execute e1=m1.getAnnotation(Execute.class);
        Execute e2=m2.getAnnotation(Execute.class);
        System.out.println(e.Sequence());
        System.out.println(e1.Sequence());
        System.out.println(e2.Sequence());
    }
}