package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part3Test {

    public static String part3main(String[] args){
        String string = "";
        for(String arg : args){
            string = string + arg + " ";
        } if(string.equals("")){
            return string;
        } else {
            return string.substring(0, string.length()-1);
        }
    }

    @Test
    public void part3test(){

        String[] args = new String[]{"1","2","3"};
        Assert.assertEquals(part3main(args), "1 2 3");

    }

}