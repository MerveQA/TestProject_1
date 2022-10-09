import java.util.Scanner;

public class Test_15 {
    public static void main(String[] args) {

        // 1'den başlayarak klavyeden girilen sayıya kadar
        // sayıları toplayacak her toplamda ekrana yazdıran
        // uygulamayı yapınız.
        //      Sayı Gir:10
        //      1 3 6 10 15 21 28 36 45 55

        Scanner scan = new Scanner(System.in);
        System.out.print(" bir tam sayi giriniz : ");
        int sayi = scan.nextInt();

        int toplam=0;
        for(int i=1; i<=sayi; i++){
            toplam+=i;
            System.out.println(i+". toplam : "+toplam);
        }
    }
}
