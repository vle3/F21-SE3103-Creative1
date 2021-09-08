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
                String USResult = 
                panel.getConverter().convert(input, inputCurrency, "Dollar");
                panel.getUSDollarField().setText(USResult);

                String UKResult = 
                panel.getConverter().convert(input, inputCurrency, "Pound");
                panel.getUKField().setText(UKResult);

                String EUResult = 
                panel.getConverter().convert(input, inputCurrency, "Euro");
                panel.getEUField().setText(EUResult);

                String YenResult = 
                panel.getConverter().convert(input, inputCurrency, "Yen");
                panel.getJPYField().setText(YenResult);

                String RupeeResult =
                panel.getConverter().convert(input, inputCurrency, "Rupee");
                panel.getRupeeField().setText(RupeeResult);
            }
            catch(NumberFormatException exception)
            {
                panel.getResultText().setText("Invalid");
            }
        }
    }   
}
