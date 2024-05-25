/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author roisf
 */
public class ModelTabel extends AbstractTableModel{
    List<ModelHewan> daftarHewan;
    
    String kolom[] = {"Nama","Hewan","Jenis","Nomor","Durasi","Total"};
    
    public ModelTabel(List<ModelHewan> daftarHewan){
        this.daftarHewan = daftarHewan;
    }

    @Override
    public int getRowCount() {
        return daftarHewan.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return daftarHewan.get(rowIndex).getNama();
            case 1:
                return daftarHewan.get(rowIndex).getHewan();
            case 2:
                return daftarHewan.get(rowIndex).getJenis();
            case 3:
                return daftarHewan.get(rowIndex).getNomor();
            case 4:
                return daftarHewan.get(rowIndex).getDurasi();
            case 5:
                return daftarHewan.get(rowIndex).getTotal();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return kolom[columnIndex];
    }

    public void removeRow(int selectedRow) {
         // Hapus baris dari daftar hewan berdasarkan indeks baris yang dipilih
    daftarHewan.remove(selectedRow);
    
    // Memberi tahu tabel bahwa baris telah dihapus
    fireTableRowsDeleted(selectedRow, selectedRow);
    }

}
