/**
 * Percobaan5NoAbsen
 */
public class Percobaan525 {

    public static void main(String[] args) {
        // Contoh pemanggilan fungsi Tampil
        Tampil ("Daspro 2019", 100,200);
        Tampil ("Teknologi informasi", 1, 2, 3, 4, 5);
        Tampil ("Polinema");
    }

    public static void Tampil(String str, int...  a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " + a.length);
        
        for (int i : a ) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}

