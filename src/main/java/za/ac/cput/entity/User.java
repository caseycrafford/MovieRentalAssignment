package za.ac.cput.entity;
/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
public class User {

    private int userId ,addressId , idNumber;
    private String firstName,lastName;

    private User(userBuilder userBuilder)
    {
        this.userId = userBuilder.userId;
        this.addressId = userBuilder.addressId;
        this.idNumber = userBuilder.idNumber;
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;


    }
    public static class userBuilder
    {
        private int userId ,addressId , idNumber;
        private String firstName,lastName;

        public userBuilder setUserId(int userId) {
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

        public userBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public userBuilder setLastName(String lastName) {
            this.lastName = lastName;
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