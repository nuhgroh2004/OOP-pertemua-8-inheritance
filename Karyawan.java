import java.text.DecimalFormat;

class Karyawan {
    protected String nik;
    private String nama;
    private double gaji;
    private int cuti = 12;
    private String gender;
    private static int nextNikKaryawan = 1;
    
    public Karyawan(String nama, double gaji, int cuti, String gender) {
        this.nama = nama;
        this.gaji = gaji;
        this.cuti = cuti;
        this.gender = gender;
        this.nik = "K" + nextNikKaryawan++;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    public String getGender() {
        return gender;
    }

    public int getCuti() {
        return cuti;
    }

    public void tambahCuti(String tipe, String gender) {
        switch (tipe.toLowerCase()) {
            case "pernikahan":
                cuti += 2;
                break;
            case "persalinan":
                if (gender.equalsIgnoreCase("Perempuan")) {
                    cuti += 90;
                } else {
                    cuti += 3;
                }
                break;
        }
    }

    public void lihatKaryawan() {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        System.out.println(
        "   Gaji = " + formatter.format(getGaji()) + 
        " | THR = " + formatter.format(getGaji()) + 
        " | Cuti = " + getCuti() +
        " | Gender = " + getGender());
    }
}