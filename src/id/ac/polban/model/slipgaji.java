package id.ac.polban.model;

public class slipgaji {
    //Static Field
    private static int counterStruk = 1;

    //Atribut Struk
    private String nomorStruk;

    //Relasi Agregation
    private karyawan karyawan;

    private int jumlahHariKerja;
    private int jamLembur;
    private double gajiPokok;
    private double upahLembur;
    private double potonganPajakBpjs;
    private double totalGajiBersih;

    public slipgaji(karyawan karyawan, int jumlahHariKerja, int jamLembur, double gajiPokok, double upahLembur, double potonganPajakBpjs, double totalgajiBersih)
    {
       this.nomorStruk = String.format("STRUK-%03d", counterStruk++);
        this.karyawan = karyawan;
        this.jumlahHariKerja = jumlahHariKerja;
        this.jamLembur = jamLembur;
        this.gajiPokok = gajiPokok;
        this.upahLembur = upahLembur;
        this.potonganPajakBpjs = potonganPajakBpjs;
        this.totalGajiBersih = totalGajiBersih;
    }

    // Getter (Nomor Struk sengaja TIDAK dibuatkan setter agar Read-Only)
    public String getNomorStruk() {
        return nomorStruk;
    }

    public karyawan getKaryawan() {
        return karyawan;
    }

    public int getJumlahHariKerja() {
        return jumlahHariKerja;
    }

    public int getJamLembur() {
        return jamLembur;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getUpahLembur() {
        return upahLembur;
    }

    public double getPotonganPajakBpjs() {
        return potonganPajakBpjs;
    }

    public double getTotalGajiBersih() {
        return totalGajiBersih;
    }

}
