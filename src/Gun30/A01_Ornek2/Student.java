package Gun30.A01_Ornek2;

public class Student {
    int id;
    String fullName;
     static int sayac=1;
    // static olmadan herzaman 1 rla başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    public Student(String fullName) {
        this.id=sayac++;
        this.fullName = fullName;
    }

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
