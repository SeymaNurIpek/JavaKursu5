package Gun07;

public class _08_StringEndsWith {
    public static void main(String[] args) {
        // EndWith bitiyor mu diye soracagiz
        // true yada false diye cevap verir

        String text="HCL teknoloji";
        System.out.println("text.endsWith(ji) = "+text.endsWith("ji"));//true
        System.out.println("text.endsWith(te) = "+text.endsWith("te"));//false
        System.out.println("text.endsWith(he) = "+text.endsWith("loji"));// true

    }
}
