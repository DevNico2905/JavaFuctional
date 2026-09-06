package functionalinterface;

import java.util.function.Function;

public class _Function {

    static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);
    }

    Function<Integer, Integer> incrementByOneFn = number -> number++;

    static int increment(int number){
        return number + 1;
    }
}
