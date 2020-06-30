package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part3Test {

    public static String part3main(String[] args){
        StringBuilder string = new StringBuilder();
        for(String arg : args){
            string.append(arg).append(" ");
        } if(string.toString().equals("")){
            return string.toString();
        } else {
            return string.toString().substring(0, string.length()-1);
        }
    }

    @Test
    public void part3test(){

        String[] args = new String[]{"1","2","3"};
        Assert.assertEquals("1 2 3", part3main(args));

    }

    @Test
    public void part3test1(){

        String[] args = new String[]{};
        Assert.assertEquals("", part3main(args));

    }

}