package AhmetHoca.YedinciHafta.Static2;

public class Student {
    public String name;
    public  String lastname;
    public  int number;
    static int count=100;


    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.number=count++;
    }
    public  int getStudentCount(){
        return count;
    }


    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
