package id.ac.polban.model;

public class karyawan {

    // Atribut Private
    private String idKaryawan;
    private String nama;
    private String departemen;

    //Kontruktor
    public karyawan(String idKaryawan, String nama, String departemen) 
    {
        setIdKaryawan(idKaryawan);
        setNama(nama);
        setDepartemen(departemen);
    }

    //Getter
    public String getIDKaryawan()
    {
        return idKaryawan;
    }

    public String getNama()
    {
        return nama;
    }

    public String  getDepartemen()
    {
        return departemen;
    }

    //Setter
    public void setIdKaryawan(String idKaryawan)
    {
        if (idKaryawan != null && !idKaryawan.trim().isEmpty())
        {
            this.idKaryawan = idKaryawan;
        }
        else
        {
            this.idKaryawan = "ID-XXX";
        }
    }

    public void setNama(String nama)
    {
        if (nama != null && !nama.trim().isEmpty())
        {
            this.nama = nama;
        }
        else
        {
            this.nama = "Anonim";
        }
    }

    public void setDepartemen(String departemen)
    {
        if (departemen != null && !departemen.trim().isEmpty())
        {
            this.departemen = departemen;
        }
        else
        {
            this.departemen = "Umum";
        }
    }
}

