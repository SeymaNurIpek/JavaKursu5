package Gun28.Constructor2;

public class Kitap {
    String name;

    int publisYear;// yayinyili

    String author;// yazar

    public Kitap(String kiralik_konak, int i) {
    }

    public Kitap(int publisYear) {
        this.publisYear = publisYear;
    }


    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publisYear=" + publisYear +
                ", author='" + author + '\'' +
                '}';
    }

    public Kitap(String name, int publisYear, String author) {
        this.name = name;
        this.publisYear = publisYear;
        this.author = author;
    }

}
