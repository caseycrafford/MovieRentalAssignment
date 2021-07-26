package za.ac.cput.repository;


import za.ac.cput.entity.Role;

import java.util.HashSet;
import java.util.Set;

public class RoleRepository implements IRoleRepository
{
    private static RoleRepository repository = null;
    private Set<Role> roleDB = null;

    private RoleRepository()
    {
        roleDB = new HashSet<Role>();
    }

    public static RoleRepository getRepository()
    {
        if(repository ==null)
        {
            repository = new RoleRepository();
        }
        return repository;
    }

    @Override
    public Role create(Role role)
    {
        boolean success = roleDB.add(role);

        if(!success)
        {
            return null;

        }
        return role;

    }

    @Override
    public Role read(String roleId)
    {

        for(Role r : roleDB) {
            if (r.getRoleId().equals(roleId)) {
                return r;

            }

        }
        return null;


    }

    @Override
    public Role update(Role role)
    {
        Role oldRole = read(role.getRoleId());

        if(oldRole != null)
        {
            roleDB.remove(oldRole);
            roleDB.add(oldRole);
            return role;

        }
        return null;
    }

    @Override
    public boolean delete(String roleId)
    {
        Role roleDelete = read(roleId);

        if(roleDelete == null )
        {

            return false;

        }

        roleDB.remove(roleDelete);
        return true;

    }

    public Set<Role> getAll()
    {
        return roleDB;
    }
}
