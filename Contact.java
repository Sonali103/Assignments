package Collection;
import java.lang.String;
import java.util.*;
class Contact
{
    String name;
    String email;
    char gender;
    Contact( String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
class number
{
    int phno;
    number(int phno)
    {
        this.phno=phno;
    }

    @Override
    public String toString() {
        return "number{" +
                "phno=" + phno +
                '}';
    }
}
class Sortbyphno implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i2.compareTo(i1);
    }
}


