package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part5Test {

    private int part5main(String[] args){

        int sum = 0;
        for(String arg : args){
            sum += Integer.parseInt(arg);
        } return sum;

    }

    @Test
    public void part5test(){

        String[] array = new String[]{"1", "2", "3"};
        Assert.assertEquals(part5main(array), 6);

    }

}
