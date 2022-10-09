public class Test_16 {
    public static void main(String[] args) {

        //1-15 arasındaki sayıların küpleri
        // toplamını bularak ekrana yazdıran uygulamasını yazınız.

        int toplam =0;
        for(int i=2 ; i<15; i++){
            toplam+=i*i*i;
        }
        System.out.println(toplam);
    }
}
