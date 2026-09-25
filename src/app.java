import id.ac.polban.model.karyawan;
import id.ac.polban.model.slipgaji;
import id.ac.polban.service.hitunggaji;

public class app {
    public static void main(String[] args) {
        // 1. Inisialisasi Service dan Data Karyawan
        hitunggaji service = new hitunggaji();
        karyawan emp1 = new karyawan("EMP-101", "Budi Santoso", "Teknik & IT");
        karyawan emp2 = new karyawan("EMP-102", "Siti Aminah", "Keuangan");

        // 2. Pemrosesan Gaji (Hari kerja normal @ 350.000, lembur per jam 50%, potongan 2%)
        slipgaji slip1 = service.buatSlipGaji(emp1, 20, 10);
        slipgaji slip2 = service.buatSlipGaji(emp2, 22, 0);

        // 3. Cetak Hasil Struk
        service.cetakSlipKeKonsol(slip1);
        service.cetakSlipKeKonsol(slip2);
    }
}