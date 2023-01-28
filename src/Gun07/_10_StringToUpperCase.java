package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase : string büyük harfe çevirir

        String text="Merhaba Dunya";

        System.out.println("orjinal hali = " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        System.out.println("me ve ya ME ile başlıyormu = " +
                text.toUpperCase().startsWith("ME")     // true
        );

        System.out.println(text);
        System.out.println("text="+text.toUpperCase());
        System.out.println(text);

        System.out.println(text=text.toUpperCase());
        System.out.println(text);

    }
}
