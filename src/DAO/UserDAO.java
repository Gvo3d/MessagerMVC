package DAO;

import Model.User;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public interface UserDAO {

    public boolean addUser(User user);

    public boolean deleteUser(int id);

    public boolean passwordConfirmation(int id, String pass);

    public List userList();

    public int getUserCount();
}
