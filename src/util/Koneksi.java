/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Koneksi {
public Connection connect;
public Statement state;
public ResultSet res;
String namadatabase = "jdbc:mysql://localhost:3306/db_uas_15311636bayupratama";

public void koneksiDatabase(){
    try {
        connect = DriverManager.getConnection(namadatabase,"root","");
        System.out.println("koneksitersimpan");
        state = connect.createStatement();
    } catch (SQLException ex) {
        System.err.println("cek url, user name host dan password host");
        System.err.println("SQLException:"+ ex.getMessage());
    }
}
}
