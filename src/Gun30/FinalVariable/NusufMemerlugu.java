package Gun30.FinalVariable;

public class NusufMemerlugu {
    public static void main(String[] args) {
        Vatandas v1=new Vatandas("Kerim");
        Vatandas v2=new Vatandas("Ekrem");
        Vatandas v3=new Vatandas("Emre");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        final double pi=3.14;// tanimlarken
        //pi=5; sonradan degistirilemez
        //Math.PI; javanin nasil yaptigina baktim
        // oda bizden kopye cekmis



    }
}
// final : değer atandıktan sonra değiştirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır
// static sayac ise: her yeni nesne oluşturulduğunda
// yeni artan değer almasını sağlıyor
