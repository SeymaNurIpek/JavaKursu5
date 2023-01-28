package Gun31.Enum2;

public class User {
    String  userName;
   Role role;
    Statu statu;

    public User(String userName, Role role, Statu statu) {
        this.userName = userName;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
