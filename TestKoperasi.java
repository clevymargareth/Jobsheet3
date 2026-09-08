public class TestKoperasi {
    public static void main(String[] args) {
        Member doni = new Member("Doni Wahyudi", "Jl. Merdeka No. 10");
        System.out.println("Nama Anggota: " + doni.getNama());
        System.out.println("Alamat: " + doni.getAlamat());
        System.out.println("Simpanan Saat Ini: Rp " + doni.getSimpanan());

        System.out.println("\nMeminjam uang 10.000...");
        doni.pinjam(10000);
        System.out.println("Simpanan Saat Ini: Rp " + doni.getSimpanan());

        System.out.println("\nMenabung simpanan sebesar 50.000...");
        doni.setor(50000);
        System.out.println("Simpanan Saat Ini: Rp " + doni.getSimpanan());
    }
}
