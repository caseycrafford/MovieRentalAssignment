package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
@Entity
public class User {

    @Id
    private String userId;

    private int addressId , idNumber;
    private String firstName,lastName;

    public User() {}

    private User(userBuilder userBuilder)
    {
        this.userId = userBuilder.userId;
        this.addressId = userBuilder.addressId;
        this.idNumber = userBuilder.idNumber;
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getUserId() {
        return userId;
    }

    public int getAddressId() {
        return addressId;
    }

    public int getIdNumber() {
        return idNumber;
    }



    public static class userBuilder
    {
        private int addressId , idNumber;
        private String firstName,lastName,userId;


        public userBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public userBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public userBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public userBuilder setAddressId(int addressId) {
            this.addressId = addressId;
            return this;
        }

        public userBuilder setIdNumber(int idNumber) {
            this.idNumber = idNumber;
            return this;
        }


        public userBuilder copy(User user)
        {
            this.userId = user.userId;
            this.addressId = user.addressId;
            this.idNumber = user.idNumber;
            this.firstName = user.firstName;
            this.lastName = user.lastName;

            return this;


        }

        public User build()
        {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", addressId=" + addressId +
                ", idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }



}