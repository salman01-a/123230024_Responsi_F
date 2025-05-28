/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.LoginPage;
import Model.User.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab Informatika
 */
public class ControllerUser {
    LoginPage Login;
    InterfaceDAOUser daoUser;
    
    public ControllerUser(LoginPage Login){
        this.Login = Login;
        this.daoUser = new DAOUser();
    }
    
    public void Login(){
        String User = Login.getUser();
        String Pass = Login.getPass();
        
        String nama = daoUser.Login(User, Pass);
        
        if (nama != null) {
          JOptionPane.showMessageDialog(Login, "Berhasil");
          new View.Penyewa.HalamanUtama();
         
        }else{
            JOptionPane.showMessageDialog(Login, "Gagal");
        }
        
    }
}
