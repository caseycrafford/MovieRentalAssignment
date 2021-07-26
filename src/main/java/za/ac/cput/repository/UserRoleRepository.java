package za.ac.cput.repository;

import za.ac.cput.entity.userRole;

import java.util.HashSet;
import java.util.Set;

public class UserRoleRepository implements IUserRoleRepository
{
    private static UserRoleRepository repository = null;
    private Set<userRole> userRoleDB = null;

    private UserRoleRepository()
    {
        userRoleDB = new HashSet<userRole>();
    }

    public static UserRoleRepository getRepository()
    {
        if(repository ==null)
        {
            repository = new UserRoleRepository();
        }
        return repository;
    }

    @Override
    public userRole create(userRole UserRoles)
    {
        boolean success = userRoleDB.add(UserRoles);

        if(!success)
        {
            return null;

        }
        return UserRoles;

    }

    @Override
    public userRole read(String userId)
    {

        for(userRole ur : userRoleDB) {
            if (ur.getUserId().equals(userId)) {
                return ur;

            }

        }
        return null;


    }

    @Override
    public userRole update(userRole userRole)
    {
        userRole olduserRole = read(userRole.getUserId());

        if(olduserRole != null)
        {
            userRoleDB.remove(olduserRole);
            userRoleDB.add(olduserRole);
            return olduserRole;

        }
        return null;
    }

    @Override
    public boolean delete(String userId)
    {
        userRole roleDelete = read(userId);

        if(roleDelete == null )
        {

            return false;

        }

        userRoleDB.remove(roleDelete);
        return true;

    }

    public Set<userRole> getAll()
    {
        return userRoleDB;
    }
}
