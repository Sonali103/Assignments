package Generics;

class Gener<E>
{
    public <E>  void swap(E[] arr, int i,int j)
    {
        E e=arr[i];
        arr[i]=arr[j];
        arr[j]=e;
        System.out.println("after swapping");
        for(E e1:arr)
        {
            System.out.println(e1);
        }
    }
}

public class Genericmethod
{
    public static void main(String[] args)
    {
        Integer array[] = {2, 3};
        Gener s = new Gener();
        System.out.println("before swapping");
        for (Integer a : array)
        {
            System.out.println(a);
        }
        s.swap(array,0,1);
    }
}
