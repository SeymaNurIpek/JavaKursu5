package Gun07;

public class _07_StringStartsWith {
    public static void main(String[] args) {
        //StartsWith : bununla basliyor mu ?
        // sonuc true yada false

        String text="HCL teknoloji";
        System.out.println("text.startsWith(HC) = "+text.startsWith("HC"));//true
        System.out.println("text.startsWith(te) = "+text.startsWith("te"));//false
        System.out.println("text.startsWith(he) = "+text.startsWith("he"));// false


    }
}
