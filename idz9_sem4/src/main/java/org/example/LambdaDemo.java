package org.example;

import java.util.function.*;

public class LambdaDemo {
    public static final Function<String, Integer> length = String::length;
    public static final Function<String, Character> first_symbol = n -> {
        if (n.length() == 0) return null;
        else return n.charAt(0);
    };
    public static final Predicate<String> no_space = n -> !n.contains(" ");
    public static final Function<String, Integer> numb_of_words = n -> n.split(",").length;
    public static final Function<Human, Integer> human_age = Human::getAge;
    public static final BiPredicate<Human, Human> namesakes = (a, b) -> a.getSurname().equals(b.getSurname());
    public static final Function<Human, String> fullname = n -> n.getSurname() + " " + n.getName();
    public static final UnaryOperator<Human> make_older = n -> new Human(n.getSurname(), n.getName(), n.getAge() + 1, n.getSex());
    public static final PeopleOperation yonger = ((a, b, c, d) -> a.getAge() < d && b.getAge() < d && c.getAge() < d);
}
