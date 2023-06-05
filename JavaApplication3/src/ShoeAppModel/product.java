package ShoeAppModel;

public class product {
    private int id_SanPham;
    private String tenSanPham;
    private float gia;
    private int soLuong;
    private String imgUrl;
    private int id_PhanLoai;
    
    public int getId_SanPham() {
        return id_SanPham;
    }

    public void setId_SanPham(int id_SanPham) {
        this.id_SanPham = id_SanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public int getId_PhanLoai() {
        return id_PhanLoai;
    }

    public void getId_PhanLoai(int id_PhanLoai) {
        this.id_PhanLoai = id_PhanLoai;
    }
    
    public product() {
        
    }
    
    public product(int id_SanPham, String tenSanPham, float gia, int soLuong, String imgUrl, int id_PhanLoai) {
        this.id_SanPham = id_SanPham;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
        this.imgUrl = imgUrl;
        this.id_PhanLoai = id_PhanLoai;
    }
    
    public product(String tenSanPham, float gia, int soLuong) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
    }
    
    public product(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    public product(int id_SanPham, int soLuong) {
        this.id_SanPham = id_SanPham;
        this.soLuong = soLuong;
    }
}
