package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part5Test {

    public static int part5main(String[] args){

        int n = Integer.parseInt(args[0]);
        int sum = 0;
        while(n != 0 ){
            sum += n % 10;
            n /= 10;
        } return sum;

    }

    @Test
    public void part5test(){

        String[] array = new String[]{"1234"};
        Assert.assertEquals(10, part5main(array));

    }

}
