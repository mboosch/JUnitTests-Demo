package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void shouldReturnTrueWhenGivenAStringLongerThan20() {
        // GIVEN
        String longEnough = "This String will be longer than 20.";

        // WHEN
        boolean actual = Main.isLongerThan20(longEnough);

        //THEN
        assertEquals(true, actual);
    }

    @Test
    void shouldReturnFalseWhenGIvenAStringShorterThan20() {
        // GIVEN
        String toShort = "";

        // WHEN
        boolean actual = Main.isLongerThan20(toShort);

        // THEN
        assertEquals(false, actual);

    }

}