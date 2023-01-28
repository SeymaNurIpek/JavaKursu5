package AhmetHoca.UcuncuHafta;

public class Hafta3_While_DoWhile {
    public static void main(String[] args) {
        /*

         */
        int number=1;
        while (number<10){
            System.out.println("Number= "+number);
            number++;
        }
        System.out.println("do while");

        do {
            System.out.println("Number= "+number);
            number++;
        }while (number<11);
        number++;

    }
}
