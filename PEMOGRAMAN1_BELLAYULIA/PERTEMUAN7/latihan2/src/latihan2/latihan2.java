package latihan2;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input pilihan (a/b): ");
        String pilihan = sc.nextLine();

        String hewan;

        switch (pilihan) {
            case "a":
                hewan = "Ayam";
                break;
            case "b":
                hewan = "Beruang";
                break;
            default:
                hewan = "Pilihan tidak tersedia";
                break;
        }

        System.out.println("Hewan : " + hewan);

        sc.close();
    }
}