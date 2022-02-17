package com.example.calcolatorebinario;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

        System.out.println("Len " + len);

        for(int i=len; i>0; i--){
            if(number1.charAt(i) == 0){
                if(number2.charAt(i) == 0) {
                    if (reminder == 1) {
                        result = "1" + result;
                    } else {
                        result = "0" + result;
                    }
                    reminder = 0;
                }else{
                    if (reminder == 1) {
                        result = "0" + result;
                        reminder = 1;
                    } else {
                        result = "1" + result;
                        result.chars();
                        reminder = 0;
                    }
                }

                System.out.println("result if" + result);
            }
            else{
                if(number2.charAt(i) == 0){
                    if (reminder == 1) {
                        result = "0" + result;
                        reminder = 1;
                    } else {
                        result = "1" + result;
                        reminder = 0;
                    }
                }else{
                    if (reminder == 1) {
                        result = "1" + result;
                    } else {
                        result = "0" + result;
                    }
                    reminder = 1;
                }

                System.out.println("result else" + result);
            }
        }

        System.out.println(result);
        if(reminder == 1){
            result = "1" + result;
        }

        System.out.println(result);

        return result;

    }


}