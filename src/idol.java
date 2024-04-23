public class idol {
    private String nama;
    private String nama_ayah;
    private String nama_ibu;
    private int usia;
    private String tgl_ultah;
    private int thn_ultah;
    private String bln_ultah;


    public idol(){}
    public idol(String nama, String nama_ayah, String nama_ibu, int usia, String tgl_ultah, int thn_ultah, String bln_ultah){
        this.nama = nama;
        this.nama_ayah = nama_ayah;
        this.nama_ibu = nama_ibu;
        this.usia = usia;
        this.tgl_ultah = tgl_ultah;
        this.thn_ultah = thn_ultah;
        this.bln_ultah = bln_ultah;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama_ayah() {
        return nama_ayah;
    }
    public void setNama_ayah(String nama_ayah) {
        this.nama_ayah = nama_ayah;
    }
    public String getNama_ibu() {
        return nama_ibu;
    }
    public void setNama_ibu(String nama_ibu) {
        this.nama_ibu = nama_ibu;
    }
    public int getUsia() {
        return usia;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }
    public String getTgl_ultah() {
        return tgl_ultah;
    }
    public void setTgl_ultah(String tgl_ultah) {
        this.tgl_ultah = tgl_ultah;
    }
    public int getThn_ultah() {
        return thn_ultah;
    }
    public void setThn_ultah(int thn_ultah) {
        this.thn_ultah = thn_ultah;
    }
    public String getBln_ultah() {
        return bln_ultah;
    }
    public void setBln_ultah(String bln_ultah) {
        this.bln_ultah = bln_ultah;
    }

    
}
