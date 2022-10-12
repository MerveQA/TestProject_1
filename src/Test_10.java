import java.util.Scanner;

public class Test_10 {
    public static void main(String[] args) {

     // Klavyeden girilen 10 sayıdan negatif sayıların toplamını
     // ve adetini ekrana yazdıran uygulamasını yazınız.
        Scanner scan= new Scanner(System.in);
        int sayac=1;
        int negatifsayi=0;
        int negatifsayac=0;
        int ngtfToplam=0;
        while(sayac<=10){
            System.out.print(sayac+"."+ " sayı giriniz : ");
            int sayi=scan.nextInt();
            if(sayi<0){
                negatifsayac++;
                ngtfToplam+=sayi;

            }
            sayac++;
        }
        System.out.println("girdiginiz negatif sayı adedi : " + negatifsayac);
        System.out.println("girdiginiz negatif sayıların toplamı : " +ngtfToplam);


    }
}
