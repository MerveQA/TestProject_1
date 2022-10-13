import java.util.Scanner;

public class Test_08 {
    public static void main(String[] args) {
        System.out.println("toplam almakta sorun var Nerede eksik var bakar msnz");
        // Klavyeden girilen 10 sayıdan
        // pozitif sayıların toplamını bulup ekrana yazdıran
        // uygulamasını yazınız.

        Scanner scan = new Scanner(System.in);
        int sayiArr []  = new int [11];
        int toplam=0;
        for (int i = 1; i < sayiArr.length; i++) {
            System.out.print(i+"."+"Klavyeden bir sayı giriniz : ");
            sayiArr[i] = scan.nextInt();
            toplam+=sayiArr[i];



            }


        }


    }

