package net.idoprogramming.javatest.util;

import org.junit.Test;

import static net.idoprogramming.javatest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefg"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghijk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcdef4545"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbol() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcdef4545!"));
    }

}