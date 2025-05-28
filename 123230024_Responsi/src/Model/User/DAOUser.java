/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.User;
import java.sql.*;
import Model.Connector;

/**
 *
 * @author Lab Informatika
 */
public class DAOUser implements InterfaceDAOUser{

    @Override
    public String Login(String Username, String Password) {
        try {
            String query = "SELECT * FROM admin where username = ? and password = ?";
            PreparedStatement stmt = Connector.Connect().prepareStatement(query);
            stmt.setString(1, Username);
            stmt.setString(2, Password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String nama= rs.getString("username");
                return nama;
            }
            stmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
