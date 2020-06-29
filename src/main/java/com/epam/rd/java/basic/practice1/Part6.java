package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        String result = "";
        for(int i = 1; i <= n; i++){
            result = result + (2*i) + " ";
        }
        System.out.print(result.substring(0, result.length()-1));

    }
	
}
