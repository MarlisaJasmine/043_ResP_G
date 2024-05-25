/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;
import connector.connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modul.interfaceDAOHewan;

/**
 *
 * @author roisf
 */
public class DAOHewan implements interfaceDAOHewan{

    @Override
    public List<ModelHewan> getAll() {
        List<ModelHewan> listHewan = null;
            try {
            listHewan = new ArrayList<>();
            
            Statement statement = connect.connection().createStatement();
            
            String query = "SELECT * FROM titip_hewan;";
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
              
                ModelHewan hew = new ModelHewan();
                
                hew.setId(resultSet.getInt("id"));
                hew.setNama(resultSet.getString("nama_pemilik"));
                hew.setHewan(resultSet.getString("nama_hewan"));
                hew.setJenis(resultSet.getString("jenis_hewan"));
                hew.setNomor(resultSet.getString("nomor_telepon"));
                hew.setDurasi(resultSet.getInt("durasi_titip"));
                hew.setTotal(resultSet.getInt("total_biaya"));
                
                listHewan.add(hew);
            }
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return listHewan;
    }

    @Override
    public void insert(ModelHewan hewan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ModelHewan hewan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean hapusData(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
