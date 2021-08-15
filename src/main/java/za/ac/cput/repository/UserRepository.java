package za.ac.cput.repository;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
import za.ac.cput.entity.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements IUserRepository{

    private static UserRepository repository = null;
    private Set<User> userDB = null;

    private UserRepository()
    {
        userDB = new HashSet<User>();
    }

    public static UserRepository getRepository()
    {
        if(repository ==null)
        {
            repository = new UserRepository();
        }
        return repository;
    }

    @Override
    public User create(User user)
    {
        boolean success = userDB.add(user);

        if(!success)
        {
            return null;

        }
        return user;

    }
    @Override
    public User read(String userId)
    {

        for(User u : userDB) {
            if (u.getUserId().equals(userId)) {
                return u;

            }

        }
            return null;


    }

    @Override
    public User update(User user)
    {
        User newUser = read(user.getUserId());

        if(newUser != null)
        {
            userDB.remove(newUser);
            userDB.add(user);
            return user;

        }
        return null;
    }

    @Override
    public boolean delete(String userId)
    {
        User userDelete = read(userId);

        if(userDelete == null )
        {

            return false;

        }

        userDB.remove(userDelete);
        return true;

    }

    public Set<User> getAll()
    {
        return userDB;
    }
}
