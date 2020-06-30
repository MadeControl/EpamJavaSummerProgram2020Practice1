package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part2Test {

    public static int part2main(String[] args){

        int sum = 0;
        for(String arg : args){
            sum += Integer.parseInt(arg);
        } return sum;

    }

    @Test
    public void part2test(){

        String[] array = new String[]{"1", "2", "3", "4"};
        Assert.assertEquals(10, part2main(array));

    }

}