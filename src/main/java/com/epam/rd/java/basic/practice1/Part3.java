package com.epam.rd.java.basic.practice1;

@SuppressWarnings("all")
public class Part3 {

    public static void  main(String[] args) {

        StringBuilder string = new StringBuilder();
        for(String arg : args){
            string.append(arg).append(" ");
        } if(string.toString().equals("")){
            System.out.print(string.toString());
        } else {
            System.out.print(string.toString().substring(0, string.length() - 1));
        }
    }
	
}
