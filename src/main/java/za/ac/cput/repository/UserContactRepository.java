package za.ac.cput.repository;
/* ContactType.java
 Entity for the ContactType
 Author: Malcolm Camelo (217137334)
 Date: 25 June 2021
*/
import za.ac.cput.entity.UserContact;
import java.util.HashSet;
import java.util.Set;

public class UserContactRepository implements IUserContact {

    private static UserContactRepository repository = null;
    private Set<UserContact> userContactDB = null;

    private UserContactRepository()
    {
        userContactDB = new HashSet<UserContact>();

    }

    public static UserContactRepository getRepository()
    {
        if (repository == null)
        {
            repository = new UserContactRepository();
        }
    return repository;
    }


    @Override
    public UserContact create(UserContact userContact) {
        boolean success = userContactDB.add(userContact);
    if(!success)
        return null;
    return userContact;
    }

    @Override
    public UserContact read(String s ) {
        for (UserContact u: userContactDB)
            if(u.toString().equals(s)){
        return u;
            }
        return null;
    }

    @Override
    public UserContact update(UserContact userContact) {
        UserContact contact = read(userContact.toString());
        if (contact != null)
        {
            userContactDB.remove(contact);
            userContactDB.add(userContact);
            return userContact;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        UserContact contactDelete = read(s);
        if(contactDelete ==null)
            return false;
        userContactDB.remove(contactDelete);
        return true;

    }

    @Override
    public Set<UserContact> getAll() {
        return null;
    }
}
