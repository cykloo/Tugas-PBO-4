import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nrp;
    private ArrayList<MataKuliah> matkulDiambil;

    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
        this.matkulDiambil = new ArrayList<>();
    }

    public void ambilMatkul(MataKuliah mk) {
        matkulDiambil.add(mk);
    }

    public void tampil() {
        System.out.println("\nMahasiswa: " + nama + " (NRP: " + nrp + ")");
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah mk : matkulDiambil) {
            mk.tampil();
        }
    }
}
