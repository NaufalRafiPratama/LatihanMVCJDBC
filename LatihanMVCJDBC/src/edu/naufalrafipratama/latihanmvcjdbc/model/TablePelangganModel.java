/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.naufalrafipratama.latihanmvcjdbc.model;

import edu.naufalrafipratama.latihanmvcjdbc.entity.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 */
public class TablePelangganModel extends AbstractTableModel{
    
    private List<Pelanggan> list = new ArrayList<>();

    public void setList(List<Pelanggan> list) {
        this.list = list;
    }
    
    

    @Override
    public int getRowCount() {
        
        return list.size();
    }

    @Override
    public int getColumnCount() {
        
        return 5;
    }

    public boolean add(Pelanggan e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public Pelanggan get(int index) {
        return list.get(index);
    }

    public Pelanggan set(int index, Pelanggan element) {
        
        try {
        
        return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
        
    }

    public Pelanggan remove(int index) {
        
        try {
        
        return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
        
    }
    
    

    @Override
    public String getColumnName(int column) {
        
        return switch (column) {
            case 0 -> "ID";
            case 1 -> "NAMA";
            case 2 -> "ALAMAT";
            case 3 -> "TELEPON";
            case 4 -> "EMAIL";
            default -> null;
        };
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
         switch (columnIndex) {
            case 0 :
                return list.get(rowIndex).getId();
            case 1 :
                list.get(rowIndex).getNama();
            case 2 :
                list.get(rowIndex).getAlamat();
            case 3 :
                list.get(rowIndex).getTelepon();
            case 4 :
                list.get(rowIndex).getEmail();
            default: 
                return null;
        }
    }
    
}