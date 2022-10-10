public class Test_05 {
    public static void main(String[] args) {

        //  1-500 arasındaki
        // çift sayıların toplamını bularak ekrana yazdıran yazınız.
        int toplam = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                toplam = toplam + i;
            }
        }System.out.println(toplam);
    }
}
