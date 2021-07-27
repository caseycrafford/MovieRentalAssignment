package za.ac.cput.repository;


import za.ac.cput.entity.Address;
import za.ac.cput.entity.User;

import java.util.HashSet;
import java.util.Set;

public class AddressRepository implements IAddressRepository
{
    private static AddressRepository repository = null;
    private Set<Address> addressDB = null;

    private AddressRepository()
    {
        addressDB = new HashSet<Address>();
    }

    public static AddressRepository getRepository()
    {
        if(repository ==null)
        {
            repository = new AddressRepository();
        }
        return repository;
    }

    @Override
    public Address create(Address address)
    {
        boolean success = addressDB.add(address);

        if(!success)
        {
            return null;

        }
        return address;

    }

    @Override
    public Address read(String userId)
    {

        for(Address a : addressDB) {
            if (a.getUserId().equals(userId)) {
                return a;

            }

        }
        return null;


    }

    @Override
    public Address update(Address address)
    {
        Address oldAddress = read(address.getUserId());

        if(oldAddress != null)
        {
            addressDB.remove(oldAddress);
            addressDB.add(oldAddress);
            return address;

        }
        return null;
    }

    @Override
    public boolean delete(String userId)
    {
        Address addressDelete = read(userId);

        if(addressDelete == null )
        {

            return false;

        }

        addressDB.remove(addressDelete);
        return true;

    }

    public Set<Address> getAll()
    {
        return addressDB;
    }
}