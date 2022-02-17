package com.example.calcolatorebinario;

public class BinaryString{

    private BinaryString(){
        //costruttore
    }

    public static boolean isBinary(String sequence) {
        if(sequence.equals("")){
            return false;
        }
        if(sequence.startsWith("0")){
            sequence = sequence.substring(1);
        }
        return sequence.matches("[(0|1)*]");
    }

}
