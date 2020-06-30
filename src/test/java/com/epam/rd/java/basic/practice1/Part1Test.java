package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part1Test {

    public static String part1main(){

        return "Hello, World";

    }

    @Test
    public void part1test(){
        Assert.assertEquals("Hello, World", part1main());
    }

}
