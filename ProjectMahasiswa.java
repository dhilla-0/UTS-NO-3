/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectmahasiswa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
public class ProjectMahasiswa {

    public static void main(String[] args) throws IOException {
        Asprak ap = new Asprak();
        StudentStaff ss = new StudentStaff();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Jumlah Input Asprak: ");
            ap.Jumlah = Integer.parseInt(br.readLine());
            for (int i = 0; i <= ap.Jumlah; i++) {
                System.out.println("Data Asprak");
                System.out.print("NIM: ");
                ap.NIM[i] = br.readLine();
                System.out.print("Nama: ");
                ap.Nama[i] = br.readLine();
                System.out.print("Jurusan: ");
                ap.Jurusan[i] = br.readLine();
                System.out.print("IPK: ");
                ap.IPK[i] = Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah Asistensi: ");
                ap.mkAsistensi[i] = br.readLine();
                System.out.print("Jumlah pertemuan: ");
                ap.JmlPertemuan[i] = Integer.parseInt(br.readLine());
                ap.totalPendapatan();
                ap.tampilDataMhs();
                System.out.println();
            }

            System.out.print("Jumlah Input Student Staff: ");
            ss.Jumlah = Integer.parseInt(br.readLine());
            for (int j = 0; j <= ss.Jumlah; j++) {
                System.out.println("Data Asprak");
                System.out.print("NIM: ");
                ss.NIM[j] = br.readLine();
                System.out.print("Nama: ");
                ss.Nama[j] = br.readLine();
                System.out.print("Jurusan: ");
                ss.Jurusan[j] = br.readLine();
                System.out.print("IPK: ");
                ss.IPK[j] = Integer.parseInt(br.readLine());
                System.out.print("Unit kerja: ");
                ss.unitKerja[j] = Integer.parseInt(br.readLine());
                System.out.print("Jam kerja: ");
                ss.jamkerja[j] = Integer.parseInt(br.readLine());
                ss.totalPendapatan();
                ss.tampilDataMhs();
                System.out.println();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}

