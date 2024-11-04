/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
 * @author
 * NAMA    : Naufal Arif Maulana
 * KELAS   : PBO12
 * NIM     : 23176026
 * Deskripsi Program : Program ini berisi program untuk menampilkan kalkulasi
 * tunjangan gaji berdasarkan status pernikahan
 */

package PBO1;
import java.util.Scanner;

public class ProgramTunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = input.next();
        
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }
        
        double totalGaji = gajiPokok + tunjangan;
        
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t: Rp " + totalGaji);
        System.out.println("(Developed by: Naufal Arif Maulana)");
        
        input.close();
    }
}
