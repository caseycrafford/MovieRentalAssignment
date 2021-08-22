package za.ac.cput.repository;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
import za.ac.cput.entity.Address;

import java.util.Set;

public interface IAddressRepository extends IRepository<Address, String>{

    public Set<Address> getAll();
}
