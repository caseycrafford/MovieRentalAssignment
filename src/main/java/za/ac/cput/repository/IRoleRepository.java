package za.ac.cput.repository;

import za.ac.cput.entity.Role;

import java.util.Set;

public interface IRoleRepository extends IRepository<Role, String>{

    public Set<Role> getAll();
}
