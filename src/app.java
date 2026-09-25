

import id.ac.polban.model.karyawan;
import id.ac.polban.model.slipgaji;
import id.ac.polban.service.hitunggaji;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hitunggaji service = new hitunggaji();

        System.out.println("========================================");
        System.out.println("       INPUT DATA PENGGAJIAN KARYAWAN   ");
        System.out.println("========================================");

        // 1. Input Data Entitas Karyawan
        System.out.print("Masukkan ID Karyawan   : ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Karyawan : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Departemen    : ");
        String dept = scanner.nextLine();

        karyawan karyawan = new karyawan(id, nama, dept);

        // 2. Input Variabel Operasional Kerja
        System.out.print("Jumlah Hari Kerja (hari): ");
        int hariKerja = scanner.nextInt();
        System.out.print("Jumlah Jam Lembur (jam) : ");
        int jamLembur = scanner.nextInt();

        // 3. Eksekusi Relasi Dependency & Aggregation
        slipgaji slip = service.buatSlipGaji(karyawan, hariKerja, jamLembur);

        // 4. Tampilkan Slip Hasil Hitung
        service.cetakSlipKeKonsol(slip);

        scanner.close();
    }
}