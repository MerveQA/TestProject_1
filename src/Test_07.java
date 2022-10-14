public class Test_07 {
    public static void main(String[] args) {
        System.out.println("Hocalarım biraz gecikti Kusura bakmayın");
        // 1 den 10’a kadar olan sayıları kendi kadar
        // (1 rakamından 1 tane, alt satıra 2 rakamından 2 tane)
        // olan sayıları ekrana yazdıran uygulamasını yazınız.

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }

    }


}






