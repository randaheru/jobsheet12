import java.util.Scanner;

/**
 * UcapanTerimakasih
 */
public class UcapanTerimakasih25 {
    public static void main(String[] args) {
        UcapanTerimakasih();
    }

    public static String PenerimaUcapan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang anda beri ucapan");
        String namaOrang = scanner.nextLine();
        scanner.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel I could ask you anything.");

        UcapanTambahan(nama);
    }

    public static void UcapanTambahan(String nama) {
        System.out.println("Additional thanks to " + nama + " for your outstanding dedication.\n" +
                "Your support has truly made a difference in my educational journey.");
    }
}
