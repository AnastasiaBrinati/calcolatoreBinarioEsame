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

        len = len-1;

        for(int i=len; i>=0; i--){
            if(number1.charAt(i) == 0){
                if(number2.charAt(i) == 0) {
                    if (reminder == 1) {
                        result = result + "1";
                    } else {
                        result = result + "0";
                    }
                    reminder = 0;
                }else{
                    if (reminder == 1) {
                        result = result + "0";
                        reminder = 1;
                    } else {
                        result = result + "1";
                        result.chars();
                        reminder = 0;
                    }
                }

            }
            else{
                if(number2.charAt(i) == 0){
                    if (reminder == 1) {
                        result = result + "0";
                        reminder = 1;
                    } else {
                        result = result + "1";
                        reminder = 0;
                    }
                }else{
                    if (reminder == 1) {
                        result = result + "1";
                    } else {
                        result = result + "0";
                    }
                    reminder = 1;
                }

            }
        }

        if(reminder == 1){
            result = "1" + result;
        }

        return result;

    }


}