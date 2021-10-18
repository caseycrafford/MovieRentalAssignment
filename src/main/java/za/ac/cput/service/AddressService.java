package za.ac.cput.service;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Address;
import za.ac.cput.repository.AddressRepository;

import java.util.Set;

@Service
public class AddressService implements IAddressService{

    private static AddressService service = null;
    private AddressRepository  repo = null;

    private AddressService(){
        this.repo = AddressRepository.getRepository();
    }

    public static AddressService getService(){
        if(service == null){
          service =new AddressService();
        }

        return service;
    }

    @Override
    public Address create(Address address) {
        return this.repo.create(address);
    }

    @Override
    public Address read(String userId) {
        return this.repo.read(userId);
    }

    @Override
    public Address update(Address address) {
       return this.repo.update(address);
    }

    @Override
    public boolean delete(String userId) {

        return this.repo.delete(userId);
    }

    public Set<Address> getSingleAddress()
    {
        Set<Address> singleAddress =null;
        Set<Address> Addresses = getAll();

        for (Address address : Addresses)
        {
            if(address.getCountry().trim().toUpperCase().contains("A")){
                singleAddress.add(address);
            }
        }
        return singleAddress;
    }

    @Override
    public Set<Address> getAll() {
        return this.repo.getAll();
    }



}
