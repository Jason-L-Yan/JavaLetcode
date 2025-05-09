package org.example.Java;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestLambda {
    public static void main(String[] args) {
        testConsumer((result) -> {
            String finalResult = "result: " + result;
            System.out.println(finalResult);
        });
        BiConsumer<String, String> biConsumer = (v, t) -> {

        };
        biConsumer.accept("1", "2");
        testFunction(String::length);
        testSupplier(() -> String.valueOf(0));
    }

    private static void testConsumer(Consumer<String> consumer) {
        consumer.accept("test");
    }

    private static void testFunction(Function<String, Integer> function) {
        Integer length = function.apply("test");
        System.out.println(length);
    }

    private static void testSupplier(Supplier<String> supplier) {
        String s = supplier.get();
        System.out.println(s);
    }
}
