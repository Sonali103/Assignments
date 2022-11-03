package Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
public class EmployeeDetails { Integer id;
    String name;
    String department;
    int salary;
    EmployeeDetails(Integer id,String name,String department,int salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    @Override
    public String toString()
    {
        return "Employee Details {" +
                "id=" + id +", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class Sortbyid implements Comparator<EmployeeDetails>
{

    public int compare(EmployeeDetails a, EmployeeDetails b)

    {
        return a.id - b.id;
    }
}
class Sortbysalary implements Comparator<EmployeeDetails>

{
    public int compare(EmployeeDetails a, EmployeeDetails b)

    {
        return a.salary - b.salary;
    }
}
class Sortbyname implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i2.compareTo(i1);
    }
}
class Sortbydepartment implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i1.compareTo(i2);
    }


}
class TreeSetExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EmployeeDetails t1 = new EmployeeDetails(1, "a", "B", 10000);
        EmployeeDetails t2 = new EmployeeDetails(2, "b", "c", 20000);
        EmployeeDetails t3 = new EmployeeDetails(3, "c", "a", 30000);
        EmployeeDetails t4 = new EmployeeDetails(4, "d", "j", 40000);
        EmployeeDetails t5 = new EmployeeDetails(11, "e", "k", 50000);
        EmployeeDetails t6 = new EmployeeDetails(6, "f", "l", 60000);
        EmployeeDetails t7 = new EmployeeDetails(7, "g", "m", 70000);
        EmployeeDetails t8 = new EmployeeDetails(8, "h", "n", 80000);
        EmployeeDetails t9 = new EmployeeDetails(9, "i", "o", 1000);
        EmployeeDetails t10 = new EmployeeDetails(10, "j", "p", 100000);
        System.out.println("choose 1 for name choose 2 for department choose 3 for salary choose 4 for id");
        int choose = s.nextInt();
        switch (choose) {
            case 1:
                TreeSet<EmployeeDetails> s1 = new TreeSet<>(new Sortbyid());
                s1.add(t1);
                s1.add(t2);
                s1.add(t3);
                s1.add(t4);
                s1.add(t5);
                s1.add(t6);
                s1.add(t7);
                s1.add(t8);
                s1.add(t9);
                s1.add(t10);
                System.out.println(s1);
                break;
            case 2:
                TreeSet<EmployeeDetails> s2 = new TreeSet<>(new Sortbysalary());
                s2.add(t1);
                s2.add(t2);
                s2.add(t3);
                s2.add(t4);
                s2.add(t5);
                s2.add(t6);
                s2.add(t7);
                s2.add(t8);
                s2.add(t9);
                s2.add(t10);
                System.out.println(s2);
                break;
            case 3:
                TreeSet<EmployeeDetails> s3 = new TreeSet<EmployeeDetails>(new Sortbyname());
                s3.add(t1);
                s3.add(t2);
                s3.add(t3);
                s3.add(t4);
                s3.add(t5);
                s3.add(t6);
                s3.add(t7);
                s3.add(t8);
                s3.add(t9);
                s3.add(t10);
                System.out.println(s3);
                break;
            case 4:
                TreeSet<EmployeeDetails> s4 = new TreeSet<EmployeeDetails>(new Sortbydepartment());
                s4.add(t1);
                s4.add(t2);
                s4.add(t3);
                s4.add(t4);
                s4.add(t5);
                s4.add(t6);
                s4.add(t7);
                s4.add(t8);
                s4.add(t9);
                s4.add(t10);
                System.out.println(s4);
                break;
        }
    }
}


