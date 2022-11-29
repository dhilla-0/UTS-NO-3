/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmahasiswa;

/**
 *
 * @author hp
 */
public class Asprak extends Mahasiswa implements Pendapatan{
    public String mkAsistensi[];
    public int JmlPertemuan[];
    
    public Asprak(){
        
    }

    @Override
    public double totalPendapatan() {
        return JmlPertemuan[Jumlah]*50000;
    }

    public void tampilDataMhs() {
        TampilDataMhs();
        System.out.println("Mata Kuliah Asistensi: " + mkAsistensi[Jumlah]);
        System.out.println("Jumlah Pertemuan: " + JmlPertemuan[Jumlah]);
        System.out.println("Total Pendapatan: " + totalPendapatan());
    }
}
