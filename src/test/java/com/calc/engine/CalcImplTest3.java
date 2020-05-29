package com.calc.engine;

import org.junit.*;

import static junit.framework.TestCase.*;

public class CalcImplTest3 {

    private Calc calc = new CalcImpl();

    @BeforeClass
    public static void globalInit(){
        System.out.println("@Before class");
    }



    @Before
    public void init(){
        System.out.println("\t@Before each test method");
    }




    @Ignore
    @Test
    public void addTest() {

        int a = 1;
        int b = 2;
        int res = calc.add(a, b);
        //assertTrue(res==3);
        assertEquals("MyErrorMessage", 3, res);

    }

    @Test
    public void devideTest() {

        int a = 4;
        int b = 2;
        int res = calc.devide(a, b);
        //==
        //assertSame(2, res);
        assertSame("My Message when error", 2, res);

    }


    @Test
    public void subtractionTest() {

        int a = 5;
        int b = 1;
        int res = calc.subtraction(a, b);
        // expected.equals(actual)
        assertEquals("My Message when error", 4, res);

    }

    @Test
    public void multiplyTest() {

        int a = 3;
        int b = 2;
        int res = calc.multiply(a, b);
        assertEquals(6, res);

    }


    @After
    public void afterMethod(){
        System.out.println("\t@After each test method");
    }

    @AfterClass
    public static void globalAfter(){
        System.out.println("@After class");
    }

}
