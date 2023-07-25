/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aldoapp.test;

import com.aldoapp.test.gui.MainFrame;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author aldo
 */

public class Test{

    

    ///@Override
    public void run(String... args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            System.out.println("Hello World!");
         //show main frame
         try{
            UIManager.setLookAndFeel( new FlatLightLaf() );

            MainFrame frame = new MainFrame();
            frame.setContentPane(new MainFrame().rootPanel);
            frame.setSize(900,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            //frame.setJMenuBar(bar);
            frame.setVisible(true);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
         }catch(Exception ex){
             ex.printStackTrace();
         }



        });
    }
   
}
