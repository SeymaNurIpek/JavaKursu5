package AhmetHoca.IkinciHafta;

public class Soru2Hafta {
    public static void main(String[] args) {
        String word= "Techno Study";
        String number="123";

        //Animal: textlerin uzunlugubu bulunuz

        System.out.println(word.length());
        System.out.println(number.length());

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.contains("h"));
        System.out.println(number.contains("h"));
        System.out.println(word.contains("H"));
        System.out.println(number.contains("H"));
        System.out.println(word.substring(0,6));

        System.out.println(word+number);
        System.out.println(word.concat(number));


    }
}
