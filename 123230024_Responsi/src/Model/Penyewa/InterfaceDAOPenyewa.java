/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Penyewa;

import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public interface InterfaceDAOPenyewa {
    public void insert(ModelPenyewa penyewa);
    public void update(ModelPenyewa penyewa);
    public void delete(int id);
    public List<ModelPenyewa> getAll();
}
