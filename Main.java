import java.awt.Dimension;

import javax.swing.JFrame;

import view.ConverterSimulator;

public class Main 
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(400, 100);
        window.setPreferredSize(new Dimension(500,500));

        var menu = new ConverterSimulator(window);
        menu.init();

        window.pack();
        window.setVisible(true);
        
    }    
}
