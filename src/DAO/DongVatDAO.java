package DAO;
import Model.DongVat;
import java.sql.*;
import java.util.*;

public class DongVatDAO {
    Connection connection;

    public DongVatDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<DongVat> readDongVat() {
        String sql = "SELECT * FROM DongVat";
        List<DongVat> dongVatLst = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String MaDV = rs.getString("MaDV");
                String TenDV = rs.getString("TenDV");
                String Loai = rs.getString("Loai");
                String MoTa = rs.getString("MoTa");
                boolean GioiTinh = rs.getBoolean("GioiTinh");
                DongVat dongVat = new DongVat(MaDV, TenDV, Loai, MoTa, GioiTinh);
                dongVatLst.add(dongVat);
            } 
            return dongVatLst;
        } catch (Exception e) {
            return dongVatLst;
        }
    }
    
    public int createDongVat(DongVat dongVat) {
        String sql = "INSERT INTO DongVat VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, dongVat.getMaDV());
            ps.setString(2, dongVat.getTenDV());
            ps.setString(3, dongVat.getLoai());
            ps.setString(4, dongVat.getMoTa());
            ps.setBoolean(5, dongVat.isGioiTinh());
            
            int ketQua = ps.executeUpdate();
            return ketQua;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int updateDongVat(DongVat dongVat) {
        String sql = "UPDATE DongVat SET TenDV = ?, Loai = ?, MoTa = ?, GioiTinh = ? WHERE MaDV = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, dongVat.getTenDV());
            ps.setString(2, dongVat.getLoai());
            ps.setString(3, dongVat.getMoTa());
            ps.setBoolean(4, dongVat.isGioiTinh());
            ps.setString(5, dongVat.getMaDV());
            
            int ketQua = ps.executeUpdate();
            return ketQua;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int deleteDongVat(String MaDV) {
        String sql = "DELETE FROM DongVat WHERE MaDV = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, MaDV);
            
            int ketQua = ps.executeUpdate();
            return ketQua;
        } catch (Exception e) {
            return 0;
        }
    }
}
