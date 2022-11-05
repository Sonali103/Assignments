package OOPS;

public class Singletone {
    static Singletone st=new Singletone();
    private void Singletone(){
        System.out.println("constructor will invoke only one object");
    }
    static Singletone getInstance()
    {
        return st;
    }
}
class Test
{
    public static void main(String args[])
    {
        Singletone st1= Singletone.getInstance();
        Singletone st2= Singletone.getInstance();
        System.out.println(st1);
        System.out.println(st2);
    }
}
