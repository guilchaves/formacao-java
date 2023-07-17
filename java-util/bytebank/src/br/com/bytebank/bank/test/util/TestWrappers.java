package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrappers {
    public static void main(String[] args) {
        Integer ageRef = Integer.valueOf(29); //autoboxing
        //Integer ageRef = 29;
        System.out.println(ageRef.doubleValue()); //unboxing

        //Double dRef = new Double(3.2);
        //Double dRef = Double.valueOf(3.2);
        Double dRef = 3.2;
        System.out.println(dRef.doubleValue());

        Boolean bRef = false;
        System.out.println(bRef.booleanValue());

        Number refNumber = Float.valueOf(29.9f);

        List<Number>  list = new ArrayList<>();
        list.add(10);
        list.add(32.6);
        list.add(12.3f);
    }
}
