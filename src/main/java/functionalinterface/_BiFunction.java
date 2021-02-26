package functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String [] args) {
        int result = incrementByOneAndMultiply(1,10);
        System.out.println("Imperative: "+result);

        int outcome = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println("Declarative: "+outcome);
    }

    //Imperative Approach
    static int incrementByOneAndMultiply(int number, int numToMultiply) {
        return ((number + 1)*numToMultiply);
    }

    //Declarative Approach
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    ((numberToIncrementByOne + 1) * numberToMultiplyBy);
}
