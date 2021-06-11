package za.ac.cput.entity;
/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
public class Address {

    private String street , city , country,province;
    private int postalCode;

    public Address(addressBuilder addressBuilder)
    {
        this.street = addressBuilder.street;
        this.city = addressBuilder.city;
        this.country = addressBuilder.country;
        this.province = addressBuilder.province;
        this.postalCode = addressBuilder.postalCode;

    }

    public static class addressBuilder
    {
        private String street , city , country,province;
        private int postalCode;

        public addressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public addressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public addressBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public addressBuilder setProvince(String province) {
            this.province = province;
            return this;
        }

        public addressBuilder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address build()
        {
            return new Address(this);

        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
