public class Test_01 {
    public static void main(String[] args) {

        // Asagıdaki sekli olusturacak code create ediniz
        //        *
        //       * *
        //      * * *
        //     * * * *
        //    * * * * *

        for (int i=0; i<6; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("****");
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }
    }


    }
}
