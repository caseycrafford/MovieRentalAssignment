package za.ac.cput.service;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */

import za.ac.cput.entity.Role;

import za.ac.cput.repository.RoleRepository;

import java.util.Set;

public class RoleService implements IRoleService {

    private static RoleService service = null;
    private RoleRepository repo = null;


    private RoleService(){
        this.repo = RoleRepository.getRepository();
    }

    public static RoleService getService(){
        if(service == null){
            service =new RoleService();
        }

        return service;
    }
    @Override
    public Role create(Role role) {
        return this.repo.create(role);
    }

    @Override
    public Role read(String roleId) {
        return this.repo.read(roleId);
    }

    @Override
    public Role update(Role role) {
        return this.repo.update(role);
    }

    @Override
    public boolean delete(String roleId) {
        return this.repo.delete(roleId);
    }

    public Set<Role> getSingleRole()
    {
        Set<Role> singleRole =null;
        Set<Role> Roles = getAll();

        for (Role role : Roles)
        {
            if(role.getDescription().trim().toUpperCase().startsWith("A")){
                singleRole.add(role);
            }
        }
        return singleRole;
    }

    @Override
    public Set<Role> getAll() {
        return this.repo.getAll();
    }
}
