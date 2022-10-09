import java.util.Scanner;

public class Test_11 {
    public static void main(String[] args) {

        // Klavyeden girilen 15 sayıdan pozitif sayıların
        // ortalamasını bulup ve negatif sayıların ortalamasını
        // bularak ekrana yazan uygulamasını yazınız.

        Scanner sc=new Scanner(System.in);

        int sayac=1;
        int negatifSayac=0;
        int negatifToplam=0;
        int pozitifSayac=0;
        int pozitifToplam=0;


        while(sayac<=15){

            System.out.print(sayac+". sayiyi girin: ");
            int sayi=sc.nextInt();

            if (sayi<0){
                negatifToplam+=sayi;
                negatifSayac++;
            }else {
                pozitifToplam+=sayi;
                pozitifSayac++;
            }
            sayac++;
        }

        System.out.println(pozitifSayac+" adet pozitif girilen sayilarin ortalamasi: "+(pozitifToplam/pozitifSayac));
        System.out.println(negatifSayac+" adet negatif girilen sayilarin ortalamasi: "+(negatifToplam/negatifSayac));





    }
}
