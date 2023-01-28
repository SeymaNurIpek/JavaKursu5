package Gun15;

public class A05_UcgenTersUcgen {
    public static void main(String[] args) {
// Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <=5; i++) {//1-2-3-4-5
            for (int j = 1; j <=i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 5; i >=1; i--) {// 5-54-3-2-1
            for (int j = 1; j <=i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }


    }
}
