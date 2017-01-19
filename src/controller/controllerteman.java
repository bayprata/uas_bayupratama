/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.modelteman;
import util.Koneksi;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class controllerteman {

    Koneksi koneksi = new Koneksi();

    public void simpanData(modelteman mt) {
        try {
            String query = "insert into tbl_temanc(nama,nope,email) values ('" + mt.getNama() + "','" + mt.getNope() + "','" + mt.getEmail() + "')";
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            koneksi.state.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tidak berhasil disimpan");
            System.err.println("" + e);
        }
    }

}
