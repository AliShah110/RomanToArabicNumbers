package de.kata.romannumbers;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabicNumber {
    private Map<String, Integer> numberData = new HashMap<String, Integer>();
    public RomanToArabicNumber(){
        numberData.put("I", 1);
        numberData.put("X", 10);
        numberData.put("L", 50);
    }

    public int getArabicNumber(String romanNumber) {
        int result = 0;
        int recent = 0;
        char[] romanDigits = romanNumber.toCharArray();
        for (char romanDigit:romanDigits) {
            int actual = numberData.get(String.valueOf(romanDigit));
            if(recent==0){
                recent = actual;
                result += actual;
            } else if(recent < actual){
                result += actual - (2*recent);
            } else {
                result += actual;
            }
            recent = actual;
        }
        return result;
    }
}
