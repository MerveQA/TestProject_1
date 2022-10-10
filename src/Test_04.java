import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) {

        // Klavyeden girilecek olan bir sayının
        // tam bölenlerini bularak ekrana yazdıran yazınız.


        Scanner sc=new Scanner(System.in);
        System.out.println("Klayveden bir sayı gir");
        int birSayi=sc.nextInt();

        for(int i=1;i<=birSayi;i++){
            if(birSayi%i==0){
                System.out.println(i);
            }


        }


    }
}
