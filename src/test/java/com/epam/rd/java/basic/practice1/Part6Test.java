package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Part6Test {

    public static int[] part6main(String[] args){

        int[] array = new int[Integer.parseInt(args[0])];
        int primeNumber = 2;
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(array[array.length-1] == 0){
            int counter = 0;
            for(int i = 2; i <= primeNumber; i++){
                if((primeNumber % i) == 0){
                    counter++;
                }
            }
            if(counter < 2){
                array[index] = primeNumber;
                index++;
                stringBuilder.append(primeNumber).append(" ");
            }
            primeNumber++;
        } return array;

    }

    @Test
    public void part6test(){

        String[] array = new String[]{"10"};
        Assert.assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]", Arrays.toString(part6main(array)));

    }

}