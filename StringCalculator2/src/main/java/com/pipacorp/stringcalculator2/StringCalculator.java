/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pipacorp.stringcalculator2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pali
 */
public class StringCalculator {

    private String text;
    private String delimeter;

    public StringCalculator() {
    }
    
    StringCalculator(String string) {
        this.delimeter = ";";
        this.text = string;
    }

    public StringCalculator(String string, String delimeter) {
        this.text=string;
        this.delimeter=delimeter;
    }
    
    
    public int indit() throws Exception{
        String[] stringTomb = text.split(delimeter);
        List<Integer> negativSzamokListaja = new ArrayList<>();
        int sum = 0;
        
        if (text.isEmpty()) return 0;
        
        for (int i = 0; i < stringTomb.length; i++) {
            if (Integer.parseInt(stringTomb[i]) < 0) {
                negativSzamokListaja.add(Integer.parseInt(stringTomb[i]));
            }
            else{
                sum = sum + Integer.parseInt(stringTomb[i]);
            }
        }
        
        kiiratas(sum);
        
        if (!negativSzamokListaja.isEmpty()) {
            throw new Exception("No negatives!" + Arrays.toString(negativSzamokListaja.toArray()));
        }
        else{
            return sum;
        }
        
        
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDelimeter(String delimeter) {
        this.delimeter = delimeter;
    }

    private void kiiratas(int sum) {
       //ide írhatnék egy 0-ás feltételvizsgálatos kiiratás konzolra, de nem teszem(az elég egyértelmű), de 
       //érdekes módon amikor a return után akartam ezt a metódust írni "unreachable statement"
       //errorral nem engedte 
    }

    

    

    

    

    
}
