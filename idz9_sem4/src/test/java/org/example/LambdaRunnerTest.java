package org.example;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;


public class LambdaRunnerTest {

    @Test
    public void functionMethodLength() {
        assertEquals(3, (int) LambdaRunner.FunctionMethod(LambdaDemo.length, "abc"));
    }

    @Test
    public void functionMethodFirstSymbol() {
        assertEquals('a', (char) LambdaRunner.FunctionMethod(LambdaDemo.first_symbol, "abc"));
    }

    @Test
    public void functionMethodFirstSymbol2() {
        assertEquals(null, LambdaRunner.FunctionMethod(LambdaDemo.first_symbol, ""));
    }

    @Test
    public void PredicateMethodNospace1() {
        assertEquals(true, LambdaRunner.PredicateMethod(LambdaDemo.no_space, "213"));
    }

    @Test
    public void PredicateMethodNospace2() {
        assertEquals(false, LambdaRunner.PredicateMethod(LambdaDemo.no_space, "213 312"));
    }

    @Test
    public void FunctionMethodNumbOfWords() {
        assertEquals(3, (int) LambdaRunner.FunctionMethod(LambdaDemo.numb_of_words, "123,123,123"));
    }

    @Test
    public void FunctionMethodAge() {
        assertEquals(0, (int) LambdaRunner.FunctionMethod(LambdaDemo.human_age, new Human()));
    }

    @Test
    public void BiPrediteNameSakes() {
        Human human = new Human();
        Human human1 = new Human();
        assertEquals(true, LambdaRunner.BiPredicatMethod(LambdaDemo.namesakes, human, human1));
    }

    @org.junit.Test
    public void predicateMethod() {
        assertEquals("Surname name", LambdaRunner.FunctionMethod(LambdaDemo.fullname, new Human()));
    }

    @org.junit.Test
    public void biPredicatMethod() {

        assertTrue(new Human("Surname", "name", 1, Human.Sex.Male).equals(LambdaRunner.FunctionMethod(LambdaDemo.make_older, new Human())));
    }

    @org.junit.Test
    public void unaryMethod() {
        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        assertTrue(LambdaRunner.PeopleMethod(LambdaDemo.yonger, human, human1, human2, 1));
    }

    @org.junit.Test
    public void peopleMethod() {
        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
       human1 = LambdaRunner.FunctionMethod(LambdaDemo.make_older, human1);
        assertFalse(LambdaRunner.PeopleMethod(LambdaDemo.yonger, human, human1, human2, 1));
    }
}