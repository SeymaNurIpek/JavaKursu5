package Gun28.Constructor1;

public class Book {

    String name;

    int publisYear;// yayinyili

    String author;// yazar

    public Book(){

    }

    public Book(String name,int publisYear,String author){
        this.name=name;
        this.publisYear=publisYear;
        this.author=author;
    }
    public Book(String name,int publisYear){
        this(name,publisYear,"");
    }
    public String toString(){
        return  name+" "+publisYear;
    }



}
