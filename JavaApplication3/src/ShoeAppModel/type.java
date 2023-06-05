package ShoeAppModel;
public class type {
    private int id_PhanLoai;
    private String TenPhanLoai;
    private String GhiChu;
    
    public int getId_PhanLoai() {
        return id_PhanLoai;
    }

    public void setId_PhanLoai(int id_PhanLoai) {
        this.id_PhanLoai = id_PhanLoai;
    }

    public String getTenPhanLoai() {
        return TenPhanLoai;
    }

    public void setTenPhanLoai(String TenPhanLoai) {
        this.TenPhanLoai = TenPhanLoai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    public type(String TenPhanLoai) {
        this.TenPhanLoai = TenPhanLoai;
    }
}
