package io.javabrains;
import java.util.Arrays;
import java.util.List;
public class OrderSt {
    public static void main(String[] args){
        List<Orders> product=Arrays.asList(
          new Orders("ASUS MOUSE","ACCEPTED",8000),
                new Orders("HP LAPTOP","COMPLETED",35000),
                new Orders("Apple","Pending",45000),
                new Orders("Honor Phone","COMPLETED",36780)

        );
        System.out.println("Printing Order that is ACCEPTED OR COMPLETED");
        printconditionally(product,o->o.getOrderStatus().startsWith("A"));
        printconditionally(product,o->o.getOrderStatus().startsWith("C"));
    }

    private static void printconditionally(List<Orders> product,Ordering orde){

        for(Orders o: product){
            if(orde.test(o)){
                System.out.println(o);
            }
        }
    }

    interface Ordering{
        boolean test(Orders o);
}}
