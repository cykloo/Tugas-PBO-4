public class MataKuliah {
    private String kode;
    private String nama;
    private Dosen dosen_pengampu;

    public MataKuliah(String kode, String nama, Dosen dosen) {
        this.kode = kode;
        this.nama = nama;
        this.dosen_pengampu = dosen;
    }

    public String getNama() {
        return nama;
    }

    public void tampil() {
        System.out.print("Mata Kuliah: " + kode + " - " + nama);
        if (dosen_pengampu != null) {
            System.out.print(" | Pengampu: " + dosen_pengampu.getNama());
        }
        System.out.println();
    }
}
