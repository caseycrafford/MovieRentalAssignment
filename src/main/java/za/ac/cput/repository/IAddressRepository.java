package za.ac.cput.repository;

import za.ac.cput.entity.Address;

import java.util.Set;

public interface IAddressRepository extends IRepository<Address, String>{

    public Set<Address> getAll();
}
