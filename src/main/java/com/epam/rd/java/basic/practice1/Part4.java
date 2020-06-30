package com.epam.rd.java.basic.practice1;

@SuppressWarnings("all")
public class Part4 {

    public static void main(String[] args) {

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
        System.out.print(array[0]);


    }

}
