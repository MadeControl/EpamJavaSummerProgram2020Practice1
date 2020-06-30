package com.epam.rd.java.basic.practice1;

@SuppressWarnings("all")
public class Part2 {

    public static void main(String[] args) {

        int sum = 0;
        for(String arg : args){
            sum += Integer.parseInt(arg);
        }
        System.out.print(sum);

    }
	
}
