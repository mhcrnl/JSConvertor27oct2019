/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsconvertor27oct2019;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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
        JFrame fereastra = new JFrame("Convertor");
        
        JButton btexit = new JButton("Inchide");
        btexit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        btexit.setBounds(130, 100, 100, 40);
        fereastra.add(btexit);
        
        fereastra.setSize(400, 300);
        fereastra.setLayout(null);
        fereastra.setVisible(true);
    }
    
}
