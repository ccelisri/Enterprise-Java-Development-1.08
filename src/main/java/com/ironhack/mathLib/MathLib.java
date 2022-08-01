package com.ironhack.mathLib;
import java.math.BigDecimal;
import java.math.MathContext;

public class MathLib {
    public static BigDecimal doubleTrouble(BigDecimal doubleMe){
        BigDecimal numToDouble = doubleMe;
        return numToDouble.multiply(numToDouble);
    }
    public static BigDecimal flipIt(BigDecimal flipMe){
        BigDecimal numToFlip = flipMe;
        return numToFlip.multiply(BigDecimal.valueOf(-1));
    }

    public static BigDecimal roundIt(BigDecimal roundNum){
        MathContext m = new MathContext(2);
        BigDecimal num = roundNum.round(m);
        return num;
    }

    public static BigDecimal flipItAndRoundIt(BigDecimal num){
        BigDecimal flippedNum = flipIt(num);
        return roundIt(flippedNum);
    }
}
