package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.border.Border;

import controller.ButtonClickListener;
import model.CurrencyConverter;

public class ConverterSimulator {
    private CurrencyConverter converter = new CurrencyConverter();
    private JFrame window;
    private JTextArea display = new JTextArea();
    private JLabel amountLabel = new JLabel("Amount");
    private JLabel toLabel = new JLabel("To");
    private JTextField amountField = new JTextField(15);
    public JTextArea USDollarField = new JTextArea();
    private JLabel USLabel = new JLabel("U.S. Dollar: ");
    public JTextArea UKField = new JTextArea();
    private JLabel UKLabel = new JLabel("G.B. Pounds: ");
    public JTextArea EUField = new JTextArea();
    private JLabel EULabel = new JLabel("Euro: ");
    public JTextArea RupeeField = new JTextArea();
    private JLabel RupeeLabel = new JLabel("Rupee");
    public JTextArea JPYField = new JTextArea();
    private JLabel JPYLabel = new JLabel("Yen: ");
    private JButton getResult = new JButton("Get Result");
    private JTextArea result = new JTextArea();

    String[] Choices = {"Dollar" , "Pound" , "Euro" , "Yen" , "Rupee" };
    private JComboBox <String> originalCurrency = new JComboBox<String>(Choices);
    private JComboBox<String> convertCurrency = new JComboBox<String>(Choices);

    public ConverterSimulator(JFrame window) {
        this.window = window;
        window.setTitle("Currency Converter");
    }

    public void init() {
        Container cp = window.getContentPane();
        // var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        //     ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            
        // scrollPane.setPreferredSize((new Dimension(500 , 500)));
        // cp .add(scrollPane, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.CENTER, southPanel);

        southPanel.setLayout(new GridLayout(4,1));
        JPanel row1 = new JPanel();
        row1.add(amountLabel);
        row1.add(amountField);
        row1.add(originalCurrency);
        southPanel.add(row1);

        JPanel row2 = new JPanel();
        row2.add(getResult);
        southPanel.add(row2);

        // JPanel row3 = new JPanel();
        // southPanel.add(row3);

        JPanel row4 = new JPanel();
        row4.add(USLabel);
        row4.add(USDollarField);
        USDollarField.setLineWrap(true);
        USDollarField.setBackground(Color.YELLOW);
        Border border = BorderFactory.createLineBorder(Color.black);
        USDollarField.setBorder(BorderFactory.createCompoundBorder(border, 
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        southPanel.add(row4);

        JPanel row5 = new JPanel();
        row5.add(UKLabel);
        row5.add(UKField);
        UKField.setLineWrap(true);
        UKField.setBackground(Color.yellow);
        border = BorderFactory.createLineBorder(Color.black);
        UKField.setBorder(BorderFactory.createCompoundBorder(border, 
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        southPanel.add(row5);

        JPanel row6 = new JPanel();
        row6.add(JPYLabel);
        row6.add(JPYField);
        JPYField.setLineWrap(true);
        JPYField.setBackground(Color.yellow);
        border = BorderFactory.createLineBorder(Color.black);
        JPYField.setBorder(BorderFactory.createCompoundBorder(border, 
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        southPanel.add(row6);
       
        JPanel row7 = new JPanel();
        row7.add(EULabel);
        row7.add(EUField);
        EUField.setLineWrap(true);
        EUField.setBackground(Color.yellow);
        border = BorderFactory.createLineBorder(Color.black);
        EUField.setBorder(BorderFactory.createCompoundBorder(border, 
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        southPanel.add(row7);

        JPanel row8 = new JPanel();
        row8.add(RupeeLabel);
        row8.add(RupeeField);
        RupeeField.setLineWrap(true);
        RupeeField.setBackground(Color.yellow);
        border = BorderFactory.createLineBorder(Color.black);
        RupeeField.setBorder(BorderFactory.createCompoundBorder(border, 
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        southPanel.add(row8);

        ButtonClickListener buttonClickListener = new ButtonClickListener(this);
        getResult.addActionListener(buttonClickListener);
    }

    public CurrencyConverter getConverter()
    {
        return converter;
    }

    public JTextField getAmountField()
    {
        return amountField;
    }
    public JTextArea getUSDollarField() {
        return USDollarField;
    }
    public JTextArea getUKField() {
        return UKField;
    }
    public JTextArea getResultText()
    {
        return result;
    }

    public JFrame getWinow()
    {
        return window;
    }
    
    public JButton getResultButton()
    {
        return getResult;
    }

    public JComboBox<String> getOriginalCurrency()
    {
        return originalCurrency;
    }

    public JComboBox<String> getConvertCurrency()
    {
        return convertCurrency;
    }
}
