package ShoeAppModel;

public class accAdmin {
    private String taiKhoan;
    private String matKhau;
    private int id_QuanLy;
    private int id_PhanQuyen;
    
    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getId_QuanLy() {
        return id_QuanLy;
    }

    public void setId_QuanLy(int id_QuanLy) {
        this.id_QuanLy = id_QuanLy;
    }

    public int getId_PhanQuyen() {
        return id_PhanQuyen;
    }

    public void setId_PhanQuyen(int id_PhanQuyen) {
        this.id_PhanQuyen = id_PhanQuyen;
    }
    
    public accAdmin(String taiKhoan, String matKhau, int id_QuanLy, int id_PhanQuyen) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.id_QuanLy = id_QuanLy;
        this.id_PhanQuyen = id_PhanQuyen;
    }
    
    public accAdmin(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }
}
