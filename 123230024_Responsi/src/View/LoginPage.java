/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame{
    
    JLabel username = new JLabel("Username: ");
    JLabel password = new JLabel("Password: ");
    
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();
    
    JButton tmblLogin = new JButton("Login");
    
    public LoginPage(){
        setVisible(true);
        setSize(720,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(username);
        add(password);
        add(user);
        add(pass);
        add(tmblLogin);
        
        username.setBounds(20, 84, 440,12);
        password.setBounds(20,152, 440,12);
        user.setBounds(18, 100, 440,32);
        pass.setBounds(18,170, 440,32);
        tmblLogin.setBounds(50,220, 240,32);
        ControllerUser controller = new ControllerUser(this);
        tmblLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.Login();
                
            }
        });
    }
    
    public String getUser(){
        return user.getText();
    }
    public String getPass(){
        return new String(pass.getPassword());
    }
}
