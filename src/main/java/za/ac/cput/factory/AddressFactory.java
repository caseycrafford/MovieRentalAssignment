package za.ac.cput.factory;

import za.ac.cput.entity.Address;
/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */

public class AddressFactory {

    public static Address build(String street , String city , String country , String province , int postalCode)
    {
        if (street.isEmpty()|| city.isEmpty()||country.isEmpty()||province.isEmpty()|| postalCode <=0)
        {
            return null;
        }

        return new Address.addressBuilder()
                .setCity(city).setCountry(country).setPostalCode(postalCode).setProvince(province)
                .setStreet(street).build();

    }
}
