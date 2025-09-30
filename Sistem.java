import java.util.ArrayList;

public class Sistem {
    private ArrayList<Mahasiswa> daftarMhs;
    private ArrayList<Dosen> daftarDosen;
    private ArrayList<MataKuliah> daftarMatkul;

    public Sistem() {
        daftarMhs = new ArrayList<>();
        daftarDosen = new ArrayList<>();
        daftarMatkul = new ArrayList<>();
    }

    public void tambahMhs(Mahasiswa m) {
        daftarMhs.add(m);
    }

    public void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public void tambahMatkul(MataKuliah mk) {
        daftarMatkul.add(mk);
    }

    public void tampilData() {
        System.out.println("===================================");
        System.out.println(" INFORMASI PENGAMBILAN MATA KULIAH   ");
        System.out.println("====================================\n");

        // Tampilkan dosen
        System.out.println(">>> DATA DOSEN <<<");
        int no = 1;
        for (Dosen d : daftarDosen) {
            System.out.print(no++ + ". ");
            d.tampil();
        }

        // Tampilkan mata kuliah
        System.out.println("\n>>> DATA MATA KULIAH <<<");
        no = 1;
        for (MataKuliah mk : daftarMatkul) {
            System.out.print(no++ + ". ");
            mk.tampil();
        }

        // Tampilkan mahasiswa + matkul yang diambil
        System.out.println("\n>>> DATA MAHASISWA <<<");
        no = 1;
        for (Mahasiswa m : daftarMhs) {
            System.out.println(no++ + ". -----------------------");
            m.tampil();
        }

        System.out.println("\n====================================");
        System.out.println("        DATA BERHASIL DITAMPILKAN    ");
        System.out.println("====================================");
    }
}
