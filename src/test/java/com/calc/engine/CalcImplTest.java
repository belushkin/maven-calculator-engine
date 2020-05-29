package com.calc.engine;


//-ea
        /*if(res!=3){
            throw new RuntimeException("Error message");
        }*/

//assert res!=3 : "Error message";

import org.junit.Test;

import static junit.framework.TestCase.*;

public class CalcImplTest {

    private Calc calc = new CalcImpl();

    private int count;

    @Test
    public void addTest() {

        //CalcImplTest calcImplTest = new CalcImplTest();
        //calcImplTest.addTest();

        System.out.println("CalcImplTest.hashCode="+this.hashCode());
        System.out.println("calc.hashCode="+calc.hashCode());

        count++;
        int a = 1;
        int b = 2;
        int res = calc.add(a, b);
        //assertTrue(res==3);
        assertEquals("MyErrorMessage", 3, res);
        System.out.println(count);
    }

    @Test
    public void devideTest() {

        //CalcImplTest calcImplTest = new CalcImplTest();
        //calcImplTest.addTest();

        System.out.println("CalcImplTest.hashCode="+this.hashCode());
        System.out.println("calc.hashCode="+calc.hashCode());

        count++;
        int a = 4;
        int b = 2;
        int res = calc.devide(a, b);
        //==
        //assertSame(2, res);
        assertSame("My Message when error", 2, res);
        System.out.println(count);
    }


    @Test
    public void subtractionTest() {
        count++;
        int a = 5;
        int b = 1;
        int res = calc.subtraction(a, b);
        // expected.equals(actual)
        assertEquals("My Message when error", 4, res);
        System.out.println(count);
    }

    @Test
    public void multiplyTest() {
        count++;
        int a = 3;
        int b = 2;
        int res = calc.multiply(a, b);
        assertEquals(6, res);
        System.out.println(count);
    }

}
