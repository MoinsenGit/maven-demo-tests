package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturnFizzWhenNumberIs3() {
        //GIVEN
        int num = 3;
        //WHEN
        String actual = FizzBuzz.fizzbuzz(num);
        //THEN
        assertEquals("Fizz", actual);
    }

    @Test
    void shouldReturnFizzWhenNumberIs5() {
        //GIVEN
        int num = 5;
        //WHEN
        String actual = FizzBuzz.fizzbuzz(num);
        //THEN
        assertEquals("Buzz", actual);
    }

    @Test
    void shouldReturnFizzWhenNumberIs15() {
        //GIVEN
        int num = 15;
        //WHEN
        String actual = FizzBuzz.fizzbuzz(num);
        //THEN
        assertEquals("FizzBuzz", actual);


    }


}