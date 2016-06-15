package Model;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class User {

    private static int usercounter=0;

    private int id;
    private String name;
    private String password;

    public User(String name, String password) {
        this.id = ++usercounter;
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != user.getId()) return false;
        return getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        return result;
    }
}
