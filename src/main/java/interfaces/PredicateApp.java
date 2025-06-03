package interfaces;

import model.Product;

import java.util.function.Predicate;

public class PredicateApp {
    private void m1(){
        Predicate<Integer> checkAge =x -> x>=18;
        Predicate<String> checkChars =x -> x.length() >=18;

        boolean result =checkAge.test(33);
        boolean result2 =checkChars.test("mitocode");
        System.out.println(result);
        System.out.println(result2);
    }
    private void m2(){
        Predicate<Integer> greaterThan = x -> x>10;
        Predicate<Integer> lowerThan = x-> x<20;

        boolean result =greaterThan.and(lowerThan).test(30);
        System.out.println(result);

     }
     private void m3(Product pro , Predicate<Product> predicate) {
            boolean result = predicate.test(pro);
            System.out.println(result);



     }
    public static void main(String[] args){


        Predicate<Product> app = x ->x.getName().length() >= 5;
        PredicateApp app2 = new PredicateApp();
        app2.m3(new Product(1, "mitocode"), app);
        //otra forma
        app2.m3(    new Product(2, "mitocode2"),
                x -> x.getName().length() >= 5);

    }
}
