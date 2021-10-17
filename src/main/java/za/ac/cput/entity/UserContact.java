package za.ac.cput.entity;

/* UserContact.java
 Entity for the UserContact
 Author: Malcolm Camelo (217137334)
 Date: 10 June 2021
*/
public class UserContact {

    private UserContact(){}

    private int userId, contactTypeId;
    private String Contact;

    public String getContact() {
        return Contact;
    }

    public int getUserId() {
        return userId;
    }

    public int getContactId() {
        return contactTypeId;
    }
    private UserContact(userContactBuilder userContactBuilder) {
        this.contactTypeId = userContactBuilder.contactTypeId;
        this.userId = userContactBuilder.userId;
        this.Contact = userContactBuilder.Contact;

    }

    public static class userContactBuilder {
        private int userId, contactTypeId;
        private String Contact;

        public userContactBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public userContactBuilder setContactTypeId(int contactTypeId) {
            this.contactTypeId = contactTypeId;
            return this;
        }

        public userContactBuilder setContact(String Contact) {
          this.Contact = Contact;
            return this;
        }

        public UserContact build() {

            return new UserContact(this);
        }
        public userContactBuilder copy(UserContact userContact)
        {
            this.userId =userContact.userId;
            this.Contact = userContact.Contact;
            this.contactTypeId = userContact.contactTypeId;


            return this;


        }
    }


    @Override
    public String toString() {
        return "UserContact " +
                "userId= " + userId +
                ", contactTypeId= " + contactTypeId +
                ", Contact='" + Contact + '\'';
    }
}
