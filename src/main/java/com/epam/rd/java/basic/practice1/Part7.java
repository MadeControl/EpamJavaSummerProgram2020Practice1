package com.epam.rd.java.basic.practice1;

public class Part7 {

    // This method isn't empty
    public static void main(String[] args) {
        String string = " ==> ";
        System.out.println("A" + string + str2int("A") + string + int2str(1));
        System.out.println("B" + string + str2int("B") + string + int2str(2));
        System.out.println("Z" + string + str2int("Z") + string + int2str(26));
        System.out.println("AA" + string + str2int("AA") + string + int2str(27));
        System.out.println("AZ" + string + str2int("AZ") + string + int2str(52));
        System.out.println("BA" + string + str2int("BA") + string + int2str(53));
        System.out.println("ZZ" + string + str2int("ZZ") + string + int2str(702));
        System.out.println("AAA" + string + str2int("AAA") + string + int2str(703));

    }

    public static int str2int(String number) {
        char[] array = number.toCharArray();
        int intNumber = 0;
        for(int i = 0; i < array.length; i++){
            intNumber += (int)Math.pow(26,i) * (array[array.length - i - 1] - 'A' + 1);
        } return intNumber;
    }


    public static String int2str(int number) {
        String result = "";
        // When 1 letter (for example: A)
        if (number >= 1 && number <= 26) {
            result = Character.toString(number + (int)'A' - 1);
            return result;
        }
        // When 2 letters (for example: AA)
        else if (number >= 27 && number <= 702) {
            int temp = number % 26;
            // When 2 letters are the same
            if (temp == 0) {
                result = result + Character.toString(((number / 26) - 1) + (int)'A' - 1)
                        + Character.toString(26 + (int)'A' - 1);
            }
            // When 2 letters are different
            else {
                result = result + Character.toString((number - temp) / 26 + (int)'A' - 1)
                        + Character.toString(temp + (int)'A' - 1);
            }
            return result;
        }
        // When 3 letters (for example: AAA)
        else if (number >= 703) {
            // for fixed number
            int ourNumber = number;
            // for third letter
            int temp = ourNumber % 26;
            result = result + Character.toString(temp + (int)'A' - 1);
            ourNumber -= temp;
            // for second letter
            temp = ourNumber % (26 * 26);
            result = Character.toString(temp / 26 + (int)'A' - 1) + result;
            ourNumber -= temp;
            // for first letter
            temp = ourNumber / (26 * 26);
            result = Character.toString(temp + (int)'A' - 1) + result;
            return result;
        }
        return result;
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }
}
