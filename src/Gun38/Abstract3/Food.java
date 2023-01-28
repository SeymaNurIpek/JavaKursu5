package Gun38.Abstract3;

public abstract class Food {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void   madeln();
    abstract public void   taste();
}
