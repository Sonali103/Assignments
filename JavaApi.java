package io.javabrains;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java .util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
        private double price = 0.0;

        public void setPrice(double price) {
            this.price = price;
        }

        public void printPrice() {
            System.out.println(price);
        }
    }

    public class JavaApi {
        public static void main(String[] args) {
            List<String> l = new ArrayList<>();
            l.add("successfully");
            l.add("easy");
            l.add("fortune");
            List<String> filtered = l.stream().filter( s -> s.length() > 5 ).collect(Collectors.<String>toList());
            System.out.println(filtered);
            Consumer<Product> updatePrice = p -> p.setPrice(5.9);
            Product p = new Product();
            updatePrice.accept(p);
            p.printPrice();
//Supplier
            int n = 3;
            display(() -> n + 10);
            display(() -> n + 100);
//Function
            modifyValue(n, val-> val + 10);
            modifyValue(n, val-> val * 100);
        }

        static void display(Supplier<Integer> arg) {
            System.out.println(arg.get());
        }
        static void modifyValue(int v, Function<Integer, Integer> function){
            int result = function.apply(v);
            System.out.println(result);
        }
        }

