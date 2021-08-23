package za.ac.cput.service;


/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */

import za.ac.cput.entity.userRole;

import za.ac.cput.repository.UserRoleRepository;

import java.util.Set;

public class UserRoleService implements IUserRoleService {

    private static UserRoleService service = null;
    private UserRoleRepository repo = null;


    private UserRoleService(){
        this.repo = UserRoleRepository.getRepository();
    }

    public static UserRoleService getService(){
        if(service == null){
            service =new UserRoleService();
        }

        return service;
    }
    @Override
    public userRole create(userRole userrole) {
        return this.repo.create(userrole);
    }

    @Override
    public userRole read(String userId) {
        return this.repo.read(userId);
    }

    @Override
    public userRole update(userRole userrole) {
        return this.repo.update(userrole);
    }

    @Override
    public boolean delete(String userId) {
        return this.repo.delete(userId);
    }

    public Set<userRole> getSingleUserRole()
    {
        Set<userRole> singleUserRole =null;
        Set<userRole> userRoles = getAll();

        for (userRole userrole : userRoles)
        {
            if(userrole.getUserId().trim().toUpperCase().contains("A")){
                singleUserRole.add(userrole);
            }
        }
        return singleUserRole;
    }

    @Override
    public Set<userRole> getAll() {
        return this.repo.getAll();
    }
}
