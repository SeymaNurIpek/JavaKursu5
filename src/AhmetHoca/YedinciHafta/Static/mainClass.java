package AhmetHoca.YedinciHafta.Static;

public class mainClass {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(Student.number);// Burda static oldugu icin nesne olusturmadan yazabildik// number static
        System.out.println(s1.deneme());// Static olmadigi icin nesne olusturmadan olmuyor// deneme static degil cunku
    }
}
