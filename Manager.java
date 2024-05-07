import java.text.DecimalFormat;

class Manager extends Karyawan {
    private boolean kantorPusat;
    private static int nextNikManager = 1;

    public Manager(String nama, double gaji, int cuti, boolean kantorPusat, String gender) {
        super(nama, gaji, cuti, gender);
        this.kantorPusat = kantorPusat;
        this.nik = "M" + nextNikManager++;
    }

    public double hitungThrManager() {
        double thr;
        if (kantorPusat) {
            thr = 2 * getGaji() + getGaji();
        } else {
            thr = 2 * getGaji() + 0.5 * getGaji();
        }
        return thr;
    }

    @Override
    public void lihatKaryawan() {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        double thrManager = hitungThrManager();
        String lokasiKerja = kantorPusat ? "Kantor pusat" : "Kantor cabang";
        System.out.println( 
        "   Bekerja di = " + lokasiKerja + 
        " | Gaji = " + formatter.format(getGaji()) + 
        " | THR = " + formatter.format(thrManager) + 
        " | Cuti = " + getCuti() + 
        " | Gender = " + getGender());
    }
}