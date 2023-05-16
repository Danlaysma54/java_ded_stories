package org.example;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamApiDemo extends LambdaDemo {
    /*    public static final UnaryOperator<ArrayList<Object>> not_null = n -> {
            ArrayList<Object> smth = new ArrayList<>();
            for (Object object : n) {
                if (object != null)
                    smth.add(object);
            }
            return smth;
        }; */
    public static final UnaryOperator<Stream<?>> not_null = n -> {
        for (int i = 0; i < n.toList().size(); i++) {
            if (n.toList().get(i) == null) {
                n.toList().remove(i);
            }
        }
        return n;
    };

}
