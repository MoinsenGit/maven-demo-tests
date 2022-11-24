package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void wennIchZweiUndFuenfEingebe_Soll7Rauskommen() {
        //given
      int a = 2;
      int b = 5;

        // when
      int actual = Main.add(a, b);

        // then
        assertEquals(7, actual);

    }

    @Test
    void esSollAngegebenWerden() {
        //given


        // when


        // then


    }
}