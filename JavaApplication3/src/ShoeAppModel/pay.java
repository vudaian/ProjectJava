package ShoeAppModel;
public class pay {
    public int getId_ThanhToan() {
        return id_ThanhToan;
    }

    public void setId_ThanhToan(int id_ThanhToan) {
        this.id_ThanhToan = id_ThanhToan;
    }

    public int getId_DonHang() {
        return id_DonHang;
    }

    public void setId_DonHang(int id_DonHang) {
        this.id_DonHang = id_DonHang;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getTrangThaiThanhToan() {
        return TrangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(String TrangThaiThanhToan) {
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    public String getHinhThucThanhToan() {
        return HinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String HinhThucThanhToan) {
        this.HinhThucThanhToan = HinhThucThanhToan;
    }
    private int id_DonHang;
    private int thanhTien;
    private String TrangThaiThanhToan;
    private String HinhThucThanhToan;
    private int id_ThanhToan;
    
    public pay(int id_ThanhToan, int id_DonHang,int thanhTien, String TrangThaiThanhToan, String HinhThucThanhToan) {
        this.id_ThanhToan = id_ThanhToan;
        this.id_DonHang = id_DonHang;
        this.thanhTien = thanhTien;
        this.TrangThaiThanhToan = TrangThaiThanhToan;
        this.HinhThucThanhToan = HinhThucThanhToan;
    }
}
