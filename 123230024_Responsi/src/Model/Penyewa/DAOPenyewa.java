/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Penyewa;
import Model.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class DAOPenyewa implements InterfaceDAOPenyewa {
      @Override
      public void insert(ModelPenyewa penyewa){
          try {
              String query = "INsert into penyewa (nama, kontak,ruang,durasi,total_harga, status) VALUES (?,?,?,?,?,?)";
              PreparedStatement stmt = Connector.Connect().prepareStatement(query);
              stmt.setString(1, penyewa.getNama());
              stmt.setString(2, penyewa.getKontak());
              stmt.setString(3, penyewa.getRuang());
              stmt.setInt(4, penyewa.getDurasi());
              stmt.setInt(5, penyewa.getHarga());
              stmt.setString(6, penyewa.getStatus());
          } catch (Exception e) {
              System.out.println(e);
          }
      }

    @Override
    public void update(ModelPenyewa penyewa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelPenyewa> getAll() {
        List<ModelPenyewa> listPenyewa = new ArrayList<>();
        try {
//            PreparedStatement stmt = Connector.Connect().createStatement();
            String query = "Select * FROM penyewa";
        } catch (Exception e) {
        }
        return listPenyewa;
    }
}
