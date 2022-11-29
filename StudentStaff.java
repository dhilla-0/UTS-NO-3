/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmahasiswa;

/**
 *
 * @author hp
 */
public class StudentStaff extends Mahasiswa implements Pendapatan {

    public int unitKerja[];
    public int jamkerja[];

    public StudentStaff(){
        
    }
    
    @Override
    public double totalPendapatan() {
        return jamkerja[Jumlah] * 30000;
    }
    
    public void tampilDataMhs(){
        TampilDataMhs();
        System.out.println("Unit Kerja: " + unitKerja[Jumlah]);
        System.out.println("Jam kerja: " + jamkerja[Jumlah]);
    }

}
