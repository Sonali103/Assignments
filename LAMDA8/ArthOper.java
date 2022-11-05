package io.javabrains;
interface MyAdd{
    int add(int a,int b);
}
interface MySub{
    int sub(int a,int b);
}
interface MyMultiple{
    int multiple(int a,int b);
}
interface MyDivision{
    int division(int a,int b);
}
public class ArthOper {
    public static void main(String[] args){
        MyAdd addFunction=(int a,int b)->a+b;
        System.out.println("the addition is "+addFunction.add(2,5));
        MySub subFunction=(int a,int b)->a-b;
        System.out.println("the subraction is "+subFunction.sub(5,3));
        MyMultiple mulFunction=(int a,int b)->a*b;
        System.out.println("the multiplication is "+mulFunction.multiple(2,5));
        MyDivision divFunction=(int a,int b)->a/b;
        System.out.println("the division of two number is "+divFunction.division(10,5));
    }
}
