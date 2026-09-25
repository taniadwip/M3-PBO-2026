package id.ac.polban.service;

import id.ac.polban.model.karyawan;
import id.ac.polban.model.slipgaji;

public class hitunggaji {
    // 1. Static Constants: Aturan tarif finansial tetap
    public static final double TARIF_HARIAN = 350000.0;
    public static final double PERSEN_LEMBUR = 0.5;   // 50% dari tarif harian
    public static final double PERSEN_POTONGAN = 0.02; // 2% pajak & BPJS

    // 2. RELASI DEPENDENCY ("uses-a"): Menggunakan Karyawan sebagai parameter sementara
    public slipgaji buatSlipGaji(karyawan karyawan, int jumlahHariKerja, int jamLembur) {
        // Validasi nilai input operasional
        int hariValid = Math.max(0, jumlahHariKerja);
        int lemburValid = Math.max(0, jamLembur);

        // Operasi Aritmatika Sesuai Kasus
        double gajiPokok = hariValid * TARIF_HARIAN;
        double tarifLemburPerJam = TARIF_HARIAN * PERSEN_LEMBUR; // Rp 175.000
        double upahLembur = lemburValid * tarifLemburPerJam;
        
        double totalGajiKotor = gajiPokok + upahLembur;
        double potongan = totalGajiKotor * PERSEN_POTONGAN;
        double gajiBersih = totalGajiKotor - potongan;

        // Membentuk objek SlipGaji (Aggregation dibentuk di sini)
        return new slipgaji(karyawan, hariValid, lemburValid, gajiPokok, upahLembur, potongan, gajiBersih);
    }

    // Method mencetak struk resmi
    public void cetakSlipKeKonsol(slipgaji slip) {
        System.out.println("\n========================================================");
        System.out.println("                 SLIP PEMBAYARAN GAJI                   ");
        System.out.println("========================================================");
        System.out.printf("%-24s: %s%n", "No. Transaksi Struk", slip.getNomorStruk());
        System.out.printf("%-24s: %s%n", "ID Karyawan", slip.getKaryawan().getIDKaryawan());
        System.out.printf("%-24s: %s%n", "Nama Pegawai", slip.getKaryawan().getNama());
        System.out.printf("%-24s: %s%n", "Departemen", slip.getKaryawan().getDepartemen());
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-24s: %d hari (x Rp %,.0f)%n", "Kehadiran Kerja", slip.getJumlahHariKerja(), TARIF_HARIAN);
        System.out.printf("%-24s: Rp %,12.0f%n", "Gaji Pokok", slip.getGajiPokok());
        System.out.printf("%-24s: %d jam (x Rp %,.0f)%n", "Lembur", slip.getJamLembur(), (TARIF_HARIAN * PERSEN_LEMBUR));
        System.out.printf("%-24s: Rp %,12.0f%n", "Upah Lembur", slip.getUpahLembur());
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-24s: Rp %,12.0f%n", "Potongan Pajak & BPJS (2%)", slip.getPotonganPajakBpjs());
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-24s: Rp %,12.0f%n", "TOTAL GAJI BERSIH", slip.getTotalGajiBersih());
        System.out.println("========================================================\n");
    }
}