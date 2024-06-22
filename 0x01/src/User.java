public class User {
    /* attributes */

    // properties
    private String name;
    private String username;
    private Integer password;

    // methods
    // constructor
    public User(String name, String username, Integer password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public Number getPassword() {
        return password;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    // customs
    public void showInfo() {
        System.out.println("Name: " + getName() + "\nUsername: " + getUsername() + "\nPassword: " + getPassword());
    }
}
