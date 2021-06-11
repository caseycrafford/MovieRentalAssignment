package za.ac.cput.entity;

/* UserContact.java
 Entity for the UserContact
 Author: Malcolm Camelo (217137334)
 Date: 10 June 2021
*/
public class UserContact
{
private int userId, contactTypeId;
private String Contact;
private UserContact(userContactBuilder userContactBuilder)
{
    this.contactTypeId = userContactBuilder.contactTypeId;
    this.userId = userContactBuilder.userId;
    this.Contact = userContactBuilder.Contact;

}
   public static class userContactBuilder
   {
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

       public userContactBuilder setContact(String contact) {
           Contact = contact;
           return this;
       }
       public UserContact build()
       {

           return new UserContact(this);
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
