import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Karyawan> daftarKaryawan = new ArrayList<>();
    
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Budi", 5000000, 12, "Laki-laki");
        daftarKaryawan.add(karyawan1);
        Karyawan karyawan2 = new Karyawan("Oci", 3000000, 12, "Perempuan");
        daftarKaryawan.add(karyawan2);
        Manager manager1 = new Manager("Anin", 5000000, 12, true, "Perempuan");
        daftarKaryawan.add(manager1);
        Manager manager2 = new Manager("boy", 8000000, 12, false, "Laki-laki");
        daftarKaryawan.add(manager2);
        Salesman salesman1 = new Salesman("Candra", 6000000, 12, 10000000, 12000000,"Laki-laki");
        daftarKaryawan.add(salesman1);

        salesman1.tambahCuti("pernikahan", "Laki-laki");
        manager1.tambahCuti("persalinan", "Perempuan");
        manager2.tambahCuti("persalinan", "Laki-Laki");

        System.out.println("\nInformasi Karyawan:");
        for (int i = 0; i < daftarKaryawan.size(); i++) {
            System.out.println((i + 1) + ". " + "Nama = " + daftarKaryawan.get(i).getNama() + " | NIK = " + daftarKaryawan.get(i).getNik());
            daftarKaryawan.get(i).lihatKaryawan();
        }
    }
}