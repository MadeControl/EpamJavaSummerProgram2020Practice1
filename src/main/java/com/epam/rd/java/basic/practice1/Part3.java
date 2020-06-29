package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void  main(String[] args) {

        String string = "";
        for(String arg : args){
            string = string + arg + " ";
        }
        System.out.print(string.substring(0, string.length()-1));

    }
	
}
