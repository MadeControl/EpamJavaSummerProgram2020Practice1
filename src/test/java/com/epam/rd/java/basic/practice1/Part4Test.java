package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part4Test {

    public static int part4main(String[] args){

        int[] array = new int[2];
        int temp;
        for(int i = 0; i < 2; i++){
            array[i] = Integer.parseInt(args[i]);
        }
        while(array[1] != 0){
            temp = array[0] % array[1];
            array[0] = array[1];
            array[1] = temp;
        }
        return array[0];

    }

    @Test
    public void part4test(){

        String[] array = new String[]{"10", "5"};
        Assert.assertEquals(5, part4main(array));

    }

}