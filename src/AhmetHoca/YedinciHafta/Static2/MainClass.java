package AhmetHoca.YedinciHafta.Static2;

public class MainClass {
    public static void main(String[] args) {
        Student student1=new Student("Havva","Gonul");
        Student student2=new Student("Ayse","Gun");
        Student student3=new Student("Seyma Nur","Ipek");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("Ogrenci sayisi= "+(student1.getStudentCount()-100));

    }
}
