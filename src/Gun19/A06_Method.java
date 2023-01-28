package Gun19;

public class A06_Method {
    public static void main(String[] args) {
        merhabaYaz(); //Math.random(); gibi
        merhabaYazIsme("Havva");  //Math.abs(-10) gibi
        cokmerhabaYaz(5);

    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");
    }
    public static void merhabaYazIsme(String isim){
        System.out.println(isim+"'ya merhaba");

    }
    public static void cokmerhabaYaz(int miktar) {
        for (int i = 0; i < miktar; i++) {
            System.out.println("merhaba");
        }

    }
}
