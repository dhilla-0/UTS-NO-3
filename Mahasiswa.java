/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmahasiswa;

/**
 *
 * @author hp
 */
public class Mahasiswa {
    protected String NIM[];
    protected String Nama[];
    protected String Jurusan[];
    protected int IPK[];
    protected int Jumlah;
    
    public void TampilDataMhs(){
        System.out.println("NIM: " + NIM[Jumlah]);
        System.out.println("Nama: " + Nama[Jumlah]);
        System.out.println("Jurusan: " + Jurusan[Jumlah]);
        System.out.println("IPK: " + IPK[Jumlah]);
    }
}