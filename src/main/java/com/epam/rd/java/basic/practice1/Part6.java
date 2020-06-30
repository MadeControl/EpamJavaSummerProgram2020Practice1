package com.epam.rd.java.basic.practice1;

public class Part6 {

    // This method isn't empty
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= n; i++){
            result.append(2*i).append(" ");
        }
        System.out.print(result.toString().substring(0, result.length()-1));

    }
	
}
