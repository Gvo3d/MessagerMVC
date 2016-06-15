package DAO;

import Model.User;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class UserDAOImpl implements UserDAO {
    HashSet<User> userData = new HashSet<>();

    @Override
    public boolean addUser(User user) {
        if (!userData.contains(user)) {
            userData.add(user);
            return true;
        } else return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public boolean passwordConfirmation(int id, String pass) {
        return false;
    }

    @Override
    public List userList() {
        return null;
    }
}
