import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        ////Patika.dev egitim kampi proje odevidir.

        /* Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

         Senaryo
         Dizinin boyutu n : 5
         Dizinin elemanlarını giriniz :
         1. Elemanı : 99
         2. Elemanı : -2
         3. Elemanı : -2121
         4. Elemanı : 1
         5. Elemanı : 0
         Sıralama : -2121 -2 0 1 99

         */



        Scanner girdi = new Scanner(System.in);
        System.out.print("Kac adet sayiyi siralayacaksiniz : ");
        int boyut = girdi.nextInt();
        int liste[] = new int [boyut];

        for (int i = 0; i < liste.length; i++) {
            System.out.print((i + 1) + ". sayiyi Giriniz: ");
            liste[i] = girdi.nextInt();
        }
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

    }
}
