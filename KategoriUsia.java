import java.util.Scanner;

public class KategoriUsia {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usia;
        System.out.print("Masukkan usia anda : ");
        usia = sc.nextInt();

        if (usia <= 0) {
            System.out.println("input tidak valid");
        } else {
            if (usia <= 12) {
                System.out.println("Anak");
            } else if (usia <= 19) {
                System.out.println("Remaja");
            } else if (usia <= 64) {
                System.out.println("Dewasa");
            } else {
                System.out.println("Lansia");
            }
        }
    }
}
