package com.example.calcolatorebinario;

public class BinaryCalculator {

    private BinaryCalculator(){
        //costruttore
    }

    private static int reminder = 0;

    public static String binarySum(String number1, String number2){

        if(!BinaryString.isBinary(number1) && !BinaryString.isBinary(number2)){
            return null;
        }

        int len = number1.length();
        StringBuilder result = new StringBuilder();

        if(len != number2.length()){
            return null;
        }

        len = len-1;

        for(int i=len; i>=0; i--){
            if(number1.charAt(i) == 0){
                if(number2.charAt(i) == 0) {
                    result.append(result + String.valueOf(reminder));
                    reminder = 0;
                }else{
                    result = check(result);
                }

            }
            else{
                if(number2.charAt(i) == 0){
                    result = check(result);
                }else{
                    result.append(result + String.valueOf(reminder));
                    reminder = 1;
                }

            }
        }

        return result.toString();

    }


    private static StringBuilder check(StringBuilder result){
        if (reminder == 1) {
            return result.append(result + "0");
        } else {
            reminder = 0;
            return result.append(result + "1");
        }
    }


}