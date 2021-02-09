package model;

import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter
{
    private double input;
    private double dollar, pound, euro, yen, rupee;
    private String result;
 
    DecimalFormat f= new DecimalFormat("##.##");

    public void enter(double n)
    {
        input = n;
    }

    public String convert(double input, String inputCurrency, String outputCurrency)
    {
        String result = "" ;

        switch(inputCurrency)
        {
            case "Dollar":
                dollar = input;
                rupee = input * 70;
                pound = input * 0.78;
                euro = input * 0.87;
                yen = input * 111.087;
            break;
            case "Pound":
                pound = input;
                rupee = input * 88;
                dollar = input * 1.26;
                euro = input * 1.10;
                yen = input * 140.93;
            break;
            case "Euro":
                euro= input;
                rupee = input * 80;
                dollar = input * 1.14;
                pound = input * 0.90;
                yen = input * 127.32;
            break;
            case "Yen":
                yen = input;
                rupee = input * 0.63;
                dollar = input * 0.008;
                euro = input * 0.007;
                pound = input * 0.007;
            break;
            case "Rupee":
                rupee = input;
                dollar = input / 70;
                pound = input / 88;
                euro = input / 80;
                pound = input / 0.63;
            break;
        }
        
        if(outputCurrency.equals("Dollar")) result = f.format(dollar);
        if(outputCurrency.equals("Pound")) result =  f.format(pound);
        if(outputCurrency.equals("Euro")) result =   f.format(euro);
        if(outputCurrency.equals("Yen")) result =   f.format(yen);
        if(outputCurrency.equals("Rupee")) result =   f.format(rupee);

        return result;
    }
}
