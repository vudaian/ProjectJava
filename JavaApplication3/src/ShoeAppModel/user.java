package ShoeAppModel;
public class user {
    private int id_User;
    private String Email;
    private String matKhau;
    private String tenKhachHang;
    private String soDienThoai;
    private String diaChi;
    
    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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
    
    public user(String Email, String matKhau) {
        this.Email = Email;
        this.matKhau = matKhau;
    }
    
    public user(int id_User, String Email, String matKhau, String tenKhachHang, String soDienThoai, String diaChi) {
        this.id_User = id_User;
        this.Email = Email;
        this.matKhau = matKhau;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }
    
    public user(String Email, String matKhau, String tenKhachHang, String soDienThoai, String diaChi) {
        this.Email = Email;
        this.matKhau = matKhau;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }
}
