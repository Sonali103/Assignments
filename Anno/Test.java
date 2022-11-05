package Anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test
{

}
class AnnotationTest {
    @Test
    public int testcase() {
        int a = 1120;
        return a;
    }

    public static void main(String[] agrs) {
        AnnotationTest t = new AnnotationTest();
        System.out.println(t.testcase());
    }
}