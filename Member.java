public class Member {
    private String nama;
    private String alamat;
    private int simpanan;

    public Member(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getSimpanan() {
        return simpanan;
    }

    public void setor(int uang) {
        this.simpanan += uang;
    }

    public void pinjam(int uang) {
        this.simpanan -= uang;
    }
}