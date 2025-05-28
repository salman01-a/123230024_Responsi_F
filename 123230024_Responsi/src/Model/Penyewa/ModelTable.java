/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Penyewa;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelTable extends AbstractTableModel{
    List<ModelPenyewa> daftarPenyewa;
    String Kolom[] = {"ID","Nama","Kontak", "Ruang Menginap", "Durasi Menginap", "Total Harga", "Status"};
    public ModelTable(List<ModelPenyewa> daftarPenyewa){
        this.daftarPenyewa = daftarPenyewa;
    }

    @Override
    public int getRowCount() {
       return  daftarPenyewa.size();
    }

    @Override
    public int getColumnCount() {
    return Kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelPenyewa penyewa = daftarPenyewa.get(rowIndex);
        switch (columnIndex) {
            case 0:return penyewa.getId();
            case 1:return penyewa.getNama();
            case 2:return penyewa.getKontak();
            case 3:return penyewa.getRuang();
            case 4:return penyewa.getDurasi();
            case 5:return penyewa.getHarga();
            case 6:return penyewa.getStatus();
                
            default:
                throw new AssertionError();
        }
    }
    public String getColumnString(int column){
        return Kolom[column];
    }
}
