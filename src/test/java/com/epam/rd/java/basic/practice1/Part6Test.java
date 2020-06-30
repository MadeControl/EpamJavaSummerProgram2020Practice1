package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Part6Test {

    public static int[] part6main(String[] args){

        int[] number = new int[Integer.parseInt(args[0])];
        int prost = 2;
        int mas = 0;
        while(number[number.length-1] == 0){
            int divisorCounter = 0;
            for(int i = 2; i <= prost; i++){
                if((prost % i) == 0){
                    divisorCounter++;
                }
            }
            if(divisorCounter < 2){
                number[mas] = prost;
                mas++;
//                System.out.print(prost);
            }
            prost++;
        }
        return number;

    }

    @Test
    public void part6test(){

        String[] array = new String[]{"10"};
        Assert.assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]", Arrays.toString(part6main(array)));

    }

}