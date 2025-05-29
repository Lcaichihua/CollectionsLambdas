package interfaces;

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
    public static void main(String[] args){
        PredicateApp app = new PredicateApp();
        app.m1();
    }
}
