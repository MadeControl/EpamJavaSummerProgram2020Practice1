package com.epam.rd.java.basic.practice1;

@SuppressWarnings("all")
public class Part6 {

    public static void main(String[] args) {

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
        } System.out.print(stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1));
    }
	
}
