package Generics;
import java.lang.String;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
public class Employee {
    long phno;
    int id;
    String name;
    int salary;
    String department;
    public Employee(int id,String name,int salary,String department)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }

    @Override
    public String toString() {
        return "(" + "name=" + name + '\'' + ",id=" + id + '\'' + ",salary=" + salary + '\'' + ",department=" + department + ")";
    }

    public static class EmployeeGenericClass {
        public static void main(String[] args)
        {
            Employee e1=new Employee(101,"ABC",10000,"a");
            Employee e2=new Employee(203,"XYZ",100000,"b");
            Set<Employee> emp = new HashSet<>();
            emp.add(e1);
            emp.add(e2);
            System.out.println(emp);
        }
    }

}
