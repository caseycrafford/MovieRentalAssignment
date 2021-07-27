package za.ac.cput.repository;

import za.ac.cput.entity.User;

import java.util.Set;

public interface IUserRepository extends IRepository<User, String>
{

    public Set<User> getAll();

}
