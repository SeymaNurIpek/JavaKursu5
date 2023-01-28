package Gun11;

public class A06_MatematikselFormuller {
    public static void main(String[] args) {
        int a=-12;
        int b=4;
        System.out.println("a`nin mutlak degeri: "+Math.abs(a));//12
        System.out.println("a ve b`deb buyuk olani: "+Math.max(a,b));//4
        System.out.println("a ve b`deb kucuk olani: "+Math.min(a,b));//4
        System.out.println("2`nin 3. kuvveti : "+Math.pow(2,3));//8.0
        System.out.println("b`nnin karekoku : "+Math.sqrt(b));//2.0
        System.out.println("round(yuvarlama) 3.1 : "+Math.round(3.1));//3
        System.out.println("round(yuvarlama) 3.5: "+Math.round(3.5));//4

        System.out.println("ceil 3.1 = "+Math.ceil(3.1));// bu rakamdan buyuk en yakin tam sayi//4.0
        System.out.println("ceil 3.5 = "+Math.ceil(3.1));// bu rakamdan buyuk en yakin tam sayi//4.0
        System.out.println("floor 3.1 = "+Math.floor(3.1));// bu rakamdan kucuk en yakin tam sayi//3.0
        System.out.println("floor 3.5 = "+Math.floor(3.5));// bu rakamdan kucuk en yakin tam sayi//3.0

    }
}
