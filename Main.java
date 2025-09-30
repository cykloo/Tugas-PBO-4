public class Main {
    public static void main(String[] args) {
        Sistem sistem = new Sistem();

        // Data Dosen
        Dosen d1 = new Dosen("Pak Fajar", "5025344");
        Dosen d2 = new Dosen("Pak Irfan", "5025345");

        sistem.tambahDosen(d1);
        sistem.tambahDosen(d2);

        // Data Mata Kuliah
        MataKuliah mk1 = new MataKuliah("IF105", "Pemrograman Berbasis Objek", d1);
        MataKuliah mk2 = new MataKuliah("IF103", "Pemrograman Web", d2);

        sistem.tambahMatkul(mk1);
        sistem.tambahMatkul(mk2);

        // Data Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Al Ghifari", "502524121");
        Mahasiswa m2 = new Mahasiswa("Fairuz Hanif", "502524112");

        // Mahasiswa mengambil matkul
        m1.ambilMatkul(mk1);
        m1.ambilMatkul(mk2);

        m2.ambilMatkul(mk2);

        sistem.tambahMhs(m1);
        sistem.tambahMhs(m2);

        // Tampilkan semua data
        sistem.tampilData();
    }
}
