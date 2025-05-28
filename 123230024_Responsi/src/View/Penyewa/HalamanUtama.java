/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Penyewa;
import Controller.ControllerPenyewa;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab Informatika
 */
public class HalamanUtama extends JFrame {
    ControllerPenyewa controller;
    Integer baris;
    JTextField tId = new JTextField();
    JTextField tNama = new JTextField();
    JTextField tKontak = new JTextField();
//    JTextField tId = new JTextField();
    JComboBox<String> ruang = new JComboBox<String>(new String[]{"A1","A2","A3","B1","B2"});
    JTextField tDurasi = new JTextField();
    JTextField tStatus = new JTextField();

JButton tambah = new JButton("add");
JButton update = new JButton("update");
JButton delete = new JButton("delete");
JButton clear = new JButton("clear");
JTable table;
DefaultTableModel tableModel;
JScrollPane scrollPane;
String namaKolom []={"ID","Nama","Kontak", "Ruang Menginap", "Durasi Menginap", "Total Harga", "Status"};

    public HalamanUtama(){
        setVisible(true);
        setSize(900,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        tableModel = new DefaultTableModel(namaKolom,0);
        table = new JTable(tableModel);
        add(scrollPane,BorderLayout.CENTER);
        JPanel panelKanan = new JPanel();
        panelKanan.setLayout(new GridLayout(10,1,12,8));
        panelKanan.add(new JLabel("Id"));
        panelKanan.add(tId);
        panelKanan.add(new JLabel("Nama"));
        panelKanan.add(tNama);
        panelKanan.add(new JLabel("Kontal"));
        panelKanan.add(tKontak);
        panelKanan.add(new JLabel("Ruang"));
        panelKanan.add(ruang);
        panelKanan.add(new JLabel("Durasi"));
        panelKanan.add(tDurasi);
        panelKanan.add(new JLabel("Status"));
        panelKanan.add(tStatus);
        
        JPanel tombol = new JPanel(new GridLayout(2,2,5,5));
        tombol.add(tambah);
        tombol.add(update);
        tombol.add(delete);
        tombol.add(clear);
        panelKanan.add(tombol);
        add(panelKanan,BorderLayout.EAST);
       
}

    public JTable getTablePenyewa(){
        return table;
    }
    
}

