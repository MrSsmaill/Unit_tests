package seminars.third.tdd;

public class User {

    String name;
    String password;

    boolean isAdmin;
    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.isAdmin = false;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            this.isAuthenticate = true;
            return true;
        } else {
            this.isAuthenticate = false;
            return false;
        }
    }
    public void logOut() {
        this.isAuthenticate = false;
    }
}