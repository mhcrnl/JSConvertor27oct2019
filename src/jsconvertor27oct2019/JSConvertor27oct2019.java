/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsconvertor27oct2019;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author mhcrnl
 */
public class JSConvertor27oct2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame fereastra = new JFrame("Convertor Celsius to Fahrenheit");
        fereastra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the panel to add components
        JPanel panel = new JPanel();
        
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        panel.setLayout(boxlayout);
        
        panel.setBorder(new EmptyBorder(new Insets(200, 250, 200, 250)));
        
        JLabel desc_lb = new JLabel("Convert Celsius to Fahrenheit");
        //panel.add(desc_lb, BorderLayout.PAGE_START);
        
        JButton btexit = new JButton("Inchide");
        btexit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        btexit.setBounds(130, 100, 100, 40);
        
        panel.add(desc_lb);
        panel.add(btexit);
        
        //fereastra.setLayout(new BorderLayout());
        fereastra.add(panel);
        fereastra.pack();
        //fereastra.setSize(400, 300);
        fereastra.setLayout(null);
        fereastra.setVisible(true);
    }
    
}
