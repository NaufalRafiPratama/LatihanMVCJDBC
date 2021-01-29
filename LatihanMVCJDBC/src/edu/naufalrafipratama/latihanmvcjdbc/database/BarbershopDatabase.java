/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.naufalrafipratama.latihanmvcjdbc.database;


import com.mysql.cj.jdbc.MysqlDataSource;
import edu.naufalrafipratama.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.naufalrafipratama.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 */
public class BarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/barbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
        
        
        
    }
    
    public static PelangganDao getPelangganDao() throws SQLException {
       
        if(pelangganDao==null) {
           pelangganDao = new PelangganDaoImpl((Connection) (com.sun.jdi.connect.spi.Connection) getConnection()); 
        }
        return pelangganDao;
    }
    
}
