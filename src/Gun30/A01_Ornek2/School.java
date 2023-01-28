package Gun30.A01_Ornek2;

public class School {
    public static void main(String[] args) {


        Student ogr1=new Student(1,"Seyma Ipek");
        Student ogr2=new Student(1,"Emre Ipek");
        Student ogr3=new Student(2,"Eren Ipek");
        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        // Problem hem id takip etmek zorundayim
        // hemde hata olasiligi yuksek
        Student ogr10=new Student("Ayse Dipi");
        Student ogr11=new Student("Fatma Arslan");
        Student ogr12=new Student("Serpil Demir");
        
        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
        
    }
}
