public class Test_06 {
    public static void main(String[] args) {

        // 1-15 arasındaki sayıların kareleri
        // toplamını bularak ekrana yazdıran uygulamasını yazınız.
        int toplam = 0;
        for (int i = 1; i<=15; i++) {

                toplam = toplam +(i*i);
            }
        System.out.println(toplam);
    }
}
