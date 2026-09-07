package optionals;

import java.util.Optional;

public class Main {

    static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default valude");

        System.out.println(value);
    }
}
