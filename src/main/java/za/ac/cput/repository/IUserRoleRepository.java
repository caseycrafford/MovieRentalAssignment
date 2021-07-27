package za.ac.cput.repository;

import za.ac.cput.entity.userRole;

import java.util.Set;

public interface IUserRoleRepository extends IRepository<userRole , String>{

    public Set<userRole> getAll();
}
