package de.kata.romannumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToArabicNumberTest {

    @Test
    public void getSingleDigit(){
        RomanToArabicNumber romanToArabicNumber = new RomanToArabicNumber();
        assertEquals(1, romanToArabicNumber.getArabicNumber("I"));
    }

    @Test
    public void getCompositeAdditiveNumber(){
        RomanToArabicNumber romanToArabicNumber = new RomanToArabicNumber();
        assertEquals(11, romanToArabicNumber.getArabicNumber("XI"));
    }

    @Test
    public void getCompositeSubstractiveNumber(){
        RomanToArabicNumber romanToArabicNumber = new RomanToArabicNumber();
        assertEquals(9, romanToArabicNumber.getArabicNumber("IX"));
    }

    @Test
    public void getCompositeNumber(){
        RomanToArabicNumber romanToArabicNumber = new RomanToArabicNumber();
        assertEquals(49, romanToArabicNumber.getArabicNumber("XLIX"));
    }
}
