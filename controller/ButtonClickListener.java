package controller;

import java.awt.event.ActionEvent;

import view.ConverterSimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ButtonClickListener implements ActionListener
{
   private ConverterSimulator panel;
   
   public ButtonClickListener(ConverterSimulator panel)
   {
       this.panel = panel;
   }

   @Override
    public void actionPerformed(ActionEvent e)
    {
        var button = e.getSource();
        if(button == panel.getResultButton())
        {
            try 
            {
                panel.getResultText().removeAll();
                double input = Double.parseDouble(panel.getAmountField().getText());
                String inputCurrency = panel.getOriginalCurrency().getSelectedItem().toString();
                String outputCurrency = panel.getConvertCurrency().getSelectedItem().toString();
                String result = 
                panel.getConverter().convert(input, inputCurrency, outputCurrency);
                panel.getResultText().setText(result);
            }
            catch(NumberFormatException exception)
            {
                panel.getResultText().setText("Invalid");
            }
        }
    }   
}
