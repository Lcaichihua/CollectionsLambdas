package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {

    private void m1() {
        // Consumer<Integer> print = x -> System.out.println(x);
        // print.accept(10);
        Consumer<String> a = x-> System.out.println(x);
        a.accept("mitocode");

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        //list.add(6);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
       // list.set(0,6);
        System.out.println(list);

        System.out.println(list2);
    }

    private void print(int x ) {
        // Consumer<Integer> print = x -> System.out.println(x);
        // print.accept(10);
         System.out.println(x);

    }

    public static void main(String[] args) {
        ConsumerApp app = new ConsumerApp();
        app.m1();


    }
}
