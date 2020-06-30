package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part6Test {

    public static String part6main(String[] args){

        int n = Integer.parseInt(args[0]);
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= n; i++){
            result.append(2*i).append(" ");
        }
        return result.toString().substring(0, result.length()-1);

    }

    @Test
    public void part6test(){

        String[] array = new String[]{"5"};
        Assert.assertEquals(part6main(array), "2 4 6 8 10");

    }

}