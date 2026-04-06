package latihan4;

import java.util.Scanner;
public class latihan4
 
{
    public static void main(String args[])

    {
        java.util.Scanner input = new Scanner (System.in);

        String nama, nim, address;
        double kehadiran, tugas, UAS, UTS, realisasi, totalNilai;

        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Input nim: ");
        nim = input.nextLine();

        System.out.print("Input address: ");
        address = input.nextLine(); 

        System.out.print("Input kehadiran: ");
        kehadiran = input.nextDouble();

        System.out.print("Input tugas: ");
        tugas = input.nextDouble();

        System.out.print("Input UTS: ");
        UTS = input.nextDouble();

        System.out.print("Input UAS: ");
        UAS = input.nextDouble();

        System.out.print("Input realisasi: ");
        realisasi = input.nextDouble();

        System.out.println("Nama: " + nama);

        System.out.println("nim: " + nim);

        System.out.println("address: " + address);

        System.out.println("kehadiran: " + kehadiran);

        System.out.println("tugas: " + tugas);

        System.out.println("UTS: " + UTS);

        System.out.println("UAS: " + UAS);

        System.out.println("realisasi: " + realisasi);

        System.out.println("totalNilai: " + totalNilai(kehadiran, tugas, UTS, UAS, realisasi));
    
    }

    public static double totalNilai(double kehadiran, double tugas, double UTS, double UAS, double realisasi) {

    double bobotKehadiran = (realisasi / 21) * 10;
    double bobotTugas = (tugas * 20) / 100;
    double bobotUTS = (UTS * 30) / 100;
    double bobotUAS = (UAS * 40) / 100;

    double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;

    return total;
    }
}
