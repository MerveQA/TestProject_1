import java.util.Scanner;

public class Test_09 {
    public static void main(String[] args) {

      //  Klavyeden girilen 10 sayıdan pozitif sayıların adetini
      //  bulup ekrana yazdıran uygulamasını yazınız.
        Scanner scan=new Scanner(System.in);
        int sayac=1;
        int pozitifsayi=0;
        int pozitifsayac=0;
        int negatifsayi=0;
        while(sayac<=10){
            System.out.print( sayac +"." + " sayı giriniz : ");
            int sayi=scan.nextInt();
            if(sayi>0){
                pozitifsayac++;
            }
            sayac++;

        }
        System.out.println("girdiginiz pozitif sayi adedi: "+pozitifsayac);


    }
}
