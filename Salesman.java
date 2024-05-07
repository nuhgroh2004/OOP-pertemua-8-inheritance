import java.text.DecimalFormat;

class Salesman extends Karyawan {
    private double target;
    private double penjualan;
    private static int nextNikSalesman = 1;

    public Salesman(String nama, double gaji, int cuti, double target,double penjualan, String gender) {
        super(nama, gaji, cuti, gender);
        this.target = target;
        this.penjualan = penjualan;
        this.nik = "S" + nextNikSalesman++;
    }

    public double getTarget() {
        return target;
    }

    public double getPenjualan() {
        return penjualan;
    }

    public double hitungThrSalesman() {
        double thr;
        if (penjualan>= target) {
            thr = 2 * getGaji();
        } else {
            thr = getGaji();
        }
        return thr;
    }

    @Override
    public void lihatKaryawan() {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        double thrSalesman = hitungThrSalesman();
        System.out.println(
                "   Gaji = " + formatter.format(getGaji()) + 
                " | Target = " + formatter.format(getTarget()) +
                " | Penjualan = " + formatter.format(getPenjualan()) +
                " | THR = " + formatter.format(thrSalesman) + 
                " | Cuti = " + getCuti() +
                " | Gender = " + getGender());
    }
}
