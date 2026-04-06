package tugas2;
import java.util.Scanner;

public class tugas2 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        String nama, nim, address;

        System.out.print("input nama: ");
        nama = input.nextLine();

        System.out.print("input nim: ");
        nim = input.nextLine();

        //tambhan address

        System.out.print("input address: ");
        address = input.nextLine();

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Address: " + address);
        
    }
}