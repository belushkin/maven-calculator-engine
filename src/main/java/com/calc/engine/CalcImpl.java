package com.calc.engine;

public class CalcImpl implements Calc {

    public int add(int a, int b) {
        System.out.println("a="+a+"; b="+b);
        return a+b;
    }

    public int multiply(int a, int b) {
        String str = String.format("a=%s; b=%s", a, b);
        System.out.println(str);
        return a*b;
    }

    public int devide(int a, int b) {
        try {
            //  Runtime.getRuntime().exec("calc.exe");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return a/b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }
}
