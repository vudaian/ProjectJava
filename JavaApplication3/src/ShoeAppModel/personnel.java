package ShoeAppModel;

public class personnel {
    private int id_QuanLy;
    private String tenQuanLy;
    private String soDienThoai;
    private String diaChi;
    private String ngaySinh;
    
    public personnel() {
        
    }
    
    public personnel(int id_QuanLy, String tenQuanLy, String soDienThoai, String diaChi, String ngaySinh) {
        this.id_QuanLy = id_QuanLy;
        this.tenQuanLy = tenQuanLy;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }
    
    public personnel(String tenQuanLy, String soDienThoai, String diaChi, String ngaySinh) {
        this.tenQuanLy = tenQuanLy;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }
    
    public int getId_QuanLy() {
        return id_QuanLy;
    }

    public void setId_QuanLy(int id_QuanLy) {
        this.id_QuanLy = id_QuanLy;
    }

    public String getTenQuanLy() {
        return tenQuanLy;
    }

    public void setTenQuanLy(String tenQuanLy) {
        this.tenQuanLy = tenQuanLy;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
