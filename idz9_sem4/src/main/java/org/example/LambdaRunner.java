package org.example;

import java.util.function.*;

public class LambdaRunner {
    public static <T,R> R FunctionMethod(Function<T, R> function, T smth) {
        return function.apply(smth);
    }

    public static <T> boolean PredicateMethod(Predicate<T> predicate, T smth) {
        return predicate.test(smth);
    }

    public static <T> boolean BiPredicatMethod(BiPredicate<T, T> biPredicate, T smth1, T smth2) {
        return biPredicate.test(smth1, smth2);
    }

    public static <T> T UnaryMethod(UnaryOperator<T> unaryOperator, T smth) {
        return unaryOperator.apply(smth);
    }

    public static <T extends Human> boolean PeopleMethod(PeopleOperation<T> peopleOperation, T human1, T human2, T human3, int age) {
        return peopleOperation.apply(human1, human2, human3, age);
    }

}

