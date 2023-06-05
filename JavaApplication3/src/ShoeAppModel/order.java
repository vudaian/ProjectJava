package ShoeAppModel;
public class order {
    private int id_donhang;
    private int id_sanpham;
    private int id_khachhang;
    private int id_quanly;
    private int soLuong;
    private String ngaydat;
    
    public order(int id_donhang, int id_sanpham, int id_khachhang, int id_quanly, int soLuong, String ngaydat) {
        this.id_donhang = id_donhang;
        this.id_sanpham = id_sanpham;
        this.id_khachhang = id_khachhang;
        this.id_quanly = id_quanly;
        this.soLuong = soLuong;
        this.ngaydat = ngaydat;
    }
    
    public order(int id_quanly) {
        this.id_quanly = id_quanly;
    }
    
    public int getId_donhang() {
        return id_donhang;
    }

    public void setId_donhang(int id_donhang) {
        this.id_donhang = id_donhang;
    }

    public int getId_sanpham() {
        return id_sanpham;
    }

    public void setId_sanpham(int id_sanpham) {
        this.id_sanpham = id_sanpham;
    }

    public int getId_khachhang() {
        return id_khachhang;
    }

    public void setId_khachhang(int id_khachhang) {
        this.id_khachhang = id_khachhang;
    }

    public int getId_quanly() {
        return id_quanly;
    }

    public void setId_quanly(int id_quanly) {
        this.id_quanly = id_quanly;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgaydat() {
        return ngaydat;
    }

    public void setNgaydat(String ngaydat) {
        this.ngaydat = ngaydat;
    }
}
