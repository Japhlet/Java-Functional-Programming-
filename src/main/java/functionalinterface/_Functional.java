package functionalinterface;

import java.util.function.Function;

public class _Functional {
    public static void main(String [] args) {
        int increment = incrementByOne(0);

        System.out.println("Imperative Increment: "+increment);

        int increment1 = incrementByOneFunction.apply(1);
        System.out.println("Declarative Increment: "+increment1);

        int multipyBy10 = multiplyBy10Function.apply(increment1);
        System.out.println("Declarative Increment: "+multipyBy10);

        Function<Integer, Integer> addBy1ThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

        int addAndMultiply = addBy1ThenMultiplyBy10.apply(4);

        System.out.println("Add and miltiply: "+addAndMultiply);
    }

    //Imperative
    static int incrementByOne(int number) {
        return number + 1;
    }

    //Declarative
    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    static  Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
}
