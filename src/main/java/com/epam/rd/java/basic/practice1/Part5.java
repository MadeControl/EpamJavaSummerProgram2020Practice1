package com.epam.rd.java.basic.practice1;

public class Part5 {

    // This method isn't empty
    public static void main(String[] args) {

        int sum = 0;
        for(String arg : args){
            sum += Integer.parseInt(arg);
        }
        System.out.print(sum);

    }
	
}
