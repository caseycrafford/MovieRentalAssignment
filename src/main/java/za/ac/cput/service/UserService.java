package za.ac.cput.service;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */

import org.springframework.stereotype.Service;
import za.ac.cput.entity.User;
import za.ac.cput.repository.UserRepository;

import java.util.Set;

@Service
public class UserService implements IUserService {

    private static UserService service = null;
    private UserRepository repo = null;


    private UserService(){
        this.repo = UserRepository.getRepository();
    }

    public static UserService getService(){
        if(service == null){
            service =new UserService();
        }

        return service;
    }
    @Override
    public User create(User user) {
        return this.repo.create(user);
    }

    @Override
    public User read(String idNumber) {
        return this.repo.read(idNumber);
    }

    @Override
    public User update(User user) {
        return this.repo.update(user);
    }

    @Override
    public boolean delete(String idNumber) {
        return this.repo.delete(idNumber);
    }

    public Set<User> getSingleUser()
    {
        Set<User> singleUserRole =null;
        Set<User> users = getAll();

        for (User uSer: users)
        {
            if(uSer.getUserId().trim().toUpperCase().contains("0")){
                singleUserRole.add(uSer);
            }
        }
        return singleUserRole;
    }

    @Override
    public Set<User> getAll() {
        return this.repo.getAll();
    }
}
