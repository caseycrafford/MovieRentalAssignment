package za.ac.cput.Entity;

/* ContactType.java
 Entity for the ContactType
 Author: Malcolm Camelo (217137334)
 Date: 10 June 2021
*/

public class ContactType {
private String name,description;
private int contactTypeId;

private ContactType(contactTypeBuilder contactTypeBuilder)
{
this.contactTypeId = contactTypeBuilder.contactTypeId;
this.description = contactTypeBuilder.description;
this.name = contactTypeBuilder.name;

}

 public static class contactTypeBuilder {
  private String name,description;
  private int contactTypeId;

  public contactTypeBuilder setName(String name) {
   this.name = name;
   return this;
  }

  public contactTypeBuilder setDescription(String description) {
   this.description = description;
   return this;
  }

  public contactTypeBuilder setContactTypeId(int contactTypeId) {
   this.contactTypeId = contactTypeId;
   return this;
  }

public ContactType build()
{

 return new ContactType(this);
}

 }

 @Override
 public String toString() {
  return "ContactType{" +
          "name='" + name + '\'' +
          ", description='" + description + '\'' +
          ", contactTypeId=" + contactTypeId +
          '}';
 }
}
