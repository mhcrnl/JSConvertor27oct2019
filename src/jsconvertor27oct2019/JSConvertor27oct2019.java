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
        
        JLabel fr_const = new JLabel("JFrame Constructors: ");
        JLabel fr_const1 = new JLabel("1 - JFrame()");
        JLabel fr_const2 = new JLabel("2 - JFrame(GraphicsConfiguration gs)");
        JLabel fr_const3 = new JLabel("3 - JFrame(String title )");
        JLabel fr_const4 = new JLabel("4 - JFrame(String title, GraphicsConfiguration gs)");
        JLabel desc_lb = new JLabel("Convert Celsius to Fahrenheit");
        //panel.add(desc_lb, BorderLayout.PAGE_START);
        /**********************************************************************
        JLabel Constructors
        **********************************************************************/
        JLabel lb_const = new JLabel("JLabel Constructors:");
        JLabel lb_const1 = new JLabel("1 - JLabel()");
        JLabel lb_const2 = new JLabel("2 - JLabel(String s)");
        JLabel lb_const3 = new JLabel("3 - JLabel(Icon i)");
        JLabel lb_const4 = new JLabel("4 - JLabel(String s, Icon i, int align)");
        /*********************************************************************
         * JLabel Methods
         */
        JLabel lb_met = new JLabel("Methods:");
        JLabel lb_met1 = new JLabel("getIcon()");
        JLabel lb_met2 = new JLabel("setIcon()");
        JLabel lb_met3 = new JLabel("getText()");
        JLabel lb_met4 = new JLabel("setText(String s");
        /********************************************************************
         * JButton Constructors
         */
        JButton bt_con = new JButton("JButton Constructors:");
        JButton bt_con1 = new JButton("JButton()");
        JButton bt_con2 = new JButton("JButton(String s)");
        JButton bt_con3 = new JButton("JButton(Icon i)");
        /*********************************************************************
         * JButton Methods
         */
        JButton bt_met = new JButton("JButton Methods:");
        JButton bt_met1 = new JButton("void setText(String s)");
        JButton bt_met2 = new JButton("String getText()");
        JButton bt_met3 = new JButton("void setEnabled(boolean)");
        JButton bt_met4 = new JButton("void setIcon(Icon i)");
        JButton bt_met5 = new JButton("icon getIcon()");
        JButton bt_met6 = new JButton("void setMnemonic(int a)");
        JButton bt_met7 = new JButton("void addActionListener(ActionListener a)");
        
        JButton btexit = new JButton("Inchide");
        btexit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        btexit.setBounds(130, 100, 100, 40);
        
        panel.add(fr_const);
        panel.add(fr_const1);
        panel.add(fr_const2);
        panel.add(fr_const3);
        panel.add(fr_const4);
        
        panel.add(lb_const);
        panel.add(lb_const1);
        panel.add(lb_const2);
        panel.add(lb_const3);
        panel.add(lb_const4);
        
        panel.add(lb_met);
        panel.add(lb_met1);
        panel.add(lb_met2);
        panel.add(lb_met3);
        panel.add(lb_met4);
        
        panel.add(bt_con);
        panel.add(bt_con1);
        panel.add(bt_con2);
        panel.add(bt_con3);
        
        panel.add(bt_met);
        panel.add(bt_met1);
        panel.add(bt_met2);
        panel.add(bt_met3);
        panel.add(bt_met4);
        panel.add(bt_met5);
        panel.add(bt_met6);
        panel.add(bt_met7);
        
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
