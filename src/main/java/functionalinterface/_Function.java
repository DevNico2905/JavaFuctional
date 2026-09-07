package functionalinterface;

import java.util.function.Function;

public class _Function {

    static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        Integer increment2 = incrementByOneFn.apply(1);
        System.out.println(increment2);

        Integer multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);
    }

    static Function<Integer, Integer> incrementByOneFn = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int increment(int number){
        return number + 1;
    }
}
