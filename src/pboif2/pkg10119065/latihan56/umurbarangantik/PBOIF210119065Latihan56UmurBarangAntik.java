package pboif2.pkg10119065.latihan56.umurbarangantik;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Umur Barang Antik dengan objek
 */
public class PBOIF210119065Latihan56UmurBarangAntik {
    
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}
