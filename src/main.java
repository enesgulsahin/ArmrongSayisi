import java.util.Scanner;
public class main {
    public static void main(String [] args) {
    Scanner inp = new Scanner(System.in);

      //  407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
      //  Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
        System.out.print("Bir sayı giriniz : ");
        int sayi;
        sayi = inp.nextInt();
        int basSayisi = 0;
        int geciciSayi = sayi;
        int basDegeri;
        int basUssu;
        int sonuc = 0;
        while( geciciSayi !=0 ) {
            geciciSayi /= 10;
            basSayisi++;
        }    geciciSayi = sayi;

        while(geciciSayi != 0) {
            basDegeri = geciciSayi % 10;
            basUssu = 1;

            for (int i = 1; i <= basSayisi; i++) {
                basUssu *= basDegeri;
            }
            sonuc += basUssu;
            geciciSayi /= 10;
        }
        if( sonuc == sayi){
            System.out.print(sayi + " sayısı bir Armstrong sayısıdır.");
        }else{
            System.out.print(sayi + " sayısı bir Armstrong sayı değildir");
        }











    }
}
