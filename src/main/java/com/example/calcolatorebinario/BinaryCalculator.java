package com.example.calcolatorebinario;

public class BinaryCalculator {

    public static String binarySum(String number1, String number2){

        if(!BinaryString.isBinary(number1) && !BinaryString.isBinary(number2)){
            return null;
        }

        int len = number1.length();
        String result = "";
        int reminder = 0;

        if(len != number2.length()){
            return null;
        }

        System.out.println("Number1 " + number1);
        System.out.println("Number2 " + number2);

        len = len-1;

        System.out.println("Len " + len);


        for(int i=len; i>0; i--){
            if(number1.charAt(i) == 0){
                if(number2.charAt(i) == 0) {
                    if (reminder == 1) {
                        result.concat("1");
                    } else {
                        result.concat("0");
                    }
                    reminder = 0;
                }else{
                    if (reminder == 1) {
                        result.concat("0");
                        reminder = 1;
                    } else {
                        result.concat("1");
                        reminder = 0;
                    }
                }
            }
            else{
                if(number2.charAt(i) == 0){
                    if (reminder == 1) {
                        result.concat("0");
                        reminder = 1;
                    } else {
                        result.concat("1");
                        reminder = 0;
                    }
                }else{
                    if (reminder == 1) {
                        result.concat("1");
                    } else {
                        result.concat("0");
                    }
                    reminder = 1;
                }
            }
        }

        System.out.println(result);
        if(reminder == 1){
            result.concat("1");
        }

        System.out.println(result);

        Character c;
        String finalResult = "";
        for (int i=0; i<result.length(); i++)
        {
            c = result.charAt(i);
            finalResult= c+finalResult;
        }

        return finalResult;

    }


}