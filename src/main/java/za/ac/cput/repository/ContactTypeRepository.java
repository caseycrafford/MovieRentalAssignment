package za.ac.cput.repository;
/* ContactType.java
 Entity for the ContactType
 Author: Malcolm Camelo (217137334)
 Date: 25 June 2021
*/

import za.ac.cput.entity.ContactType;


import java.util.HashSet;
import java.util.Set;

public class ContactTypeRepository implements IContactType {


    private static ContactTypeRepository repository = null;
    private Set<ContactType> contactTypeDB = null;

    private ContactTypeRepository() {
        contactTypeDB = new HashSet<ContactType>();

    }

    public static ContactTypeRepository getRepository() {
        if (repository == null) {
            repository = new ContactTypeRepository();
        }
        return repository;
    }

    @Override
    public Set<ContactType> getAll() {
        return contactTypeDB;
    }

    @Override
    public ContactType create(ContactType contactType) {
        boolean success = contactTypeDB.add(contactType);
        if (!success)
            return null;
        return contactType;
    }

    @Override
    public ContactType read(String contactTypeId) {
        for (ContactType c : contactTypeDB)
            if (c.getContactTypeId() == Integer.parseInt(contactTypeId)) {
                return c;
            }
        return null;
    }

    @Override
    public ContactType update(ContactType contactType) {
        ContactType contact = read(String.valueOf(contactType.getContactTypeId()));
        if (contact != null) {
            contactTypeDB.remove(contact);
            contactTypeDB.add(contactType);
            return contactType;
        }
        return null;
    }

    @Override
    public boolean delete(String contactTypeId) {
        ContactType contactDelete = read(contactTypeId);
        if (contactDelete == null)
            return false;
        contactTypeDB.remove(contactDelete);
        return true;

    }
}
