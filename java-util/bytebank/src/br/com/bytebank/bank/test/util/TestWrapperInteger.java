package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperInteger {
    public static void main(String[] args) {

        int[] ages = new int[5];
        String[] names = new String[5];

        int age = 29;
        Integer newAge = 30;

        //boxing
        Integer ageRef = Integer.valueOf(29);
        int value = ageRef.intValue();

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(age);

        String s = "12";
        Integer number = Integer.valueOf(s);
        System.out.println(number);

    }
}
