import java.util.Scanner;

public class Test_12 {
    public static void main(String[] args) {

        // Klavyeden taban ve üs değeri girilmek şartıyla
        // bir sayının kuvvetini hesaplayan programını yapınız.

        Scanner sc=new Scanner(System.in);
        System.out.print("Taban sayisini girin: ");
        int taban=sc.nextInt();
        System.out.print("Us sayisini girin: ");
        int us=sc.nextInt();

        int sayac=1;
        int ussu=1;

        while (sayac<=us){
            ussu*=taban;
            sayac++;
        }

        System.out.println(taban+" sayisinin "+us+" ussu: "+ussu);












    }
}
