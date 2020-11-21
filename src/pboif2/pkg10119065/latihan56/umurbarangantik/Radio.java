package pboif2.pkg10119065.latihan56.umurbarangantik;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Umur Barang Antik dengan objek
 */
public class Radio extends BarangAntik{
    public String name;
    
    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
