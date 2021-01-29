/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.naufalrafipratama.latihanmvcjdbc.main;

import edu.naufalrafipratama.latihanmvcjdbc.database.BarbershopDatabase;
import edu.naufalrafipratama.latihanmvcjdbc.entity.Pelanggan;
import edu.naufalrafipratama.latihanmvcjdbc.error.PelangganException;
import edu.naufalrafipratama.latihanmvcjdbc.service.PelangganDao;
import edu.naufalrafipratama.latihanmvcjdbc.view.MainViewPelanggan;
import edu.naufalrafipratama.latihanmvcjdbc.view.PelangganView;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws edu.naufalrafipratama.latihanmvcjdbc.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
       
        SwingUtilities.invokeLater(() -> {
            try {
                MainViewPelanggan pelanggan = new MainViewPelanggan();
                pelanggan.loadDatabase();
                pelanggan.setVisible(true);
            } catch (SQLException e) {
            } catch (PelangganException ex) {
                Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         
    }
    
}
