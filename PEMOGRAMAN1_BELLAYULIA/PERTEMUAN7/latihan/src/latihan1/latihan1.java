package latihan1;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {

        Scanner simpan = new Scanner(System.in);

        System.out.print("Input Pilihan : ");
        int pilihan = simpan.nextInt();
        simpan.nextLine();

        if (pilihan == 1) {

            System.out.print("Input Nama : ");
            String nama = simpan.nextLine();
            String jurusan = "Teknik Informatika";

            if (jurusan.equals("Teknik Informatika")) {

                System.out.println("1. Reg A");
                System.out.println("2. Reg B");
                System.out.println("3. Reg CK");
                System.out.println("4. Reg CS");
                System.out.print("Pilih Kelas : ");
                int pKelas = simpan.nextInt();

                String kelas;

                switch (pKelas) {
                    case 1:
                        kelas = "Reg A";
                        break;
                    case 2:
                        kelas = "Reg B";
                        break;
                    case 3:
                        kelas = "Reg CK";
                        break;
                    case 4:
                        kelas = "Reg CS";
                        break;
                    default:
                        kelas = "Reg A";
                }

                System.out.println("\n== Informasi User ==");
                System.out.println("Nama     : " + nama);
                System.out.println("Jurusan  : " + jurusan);
                System.out.println("Kelas    : " + kelas);

            } else {
                System.out.println("Data tidak ada");
            }

        } else 
            {
            System.out.println("Data tidak ada");
        }

        simpan.close();
    }
}
