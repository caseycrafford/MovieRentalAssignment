package za.ac.cput.service;
/* UserContact.java

 Author: Malcolm Camelo (217137334)
 Date: 22 August 2021
*/

import za.ac.cput.entity.ContactType;
import za.ac.cput.entity.UserContact;
import za.ac.cput.repository.UserContactRepository;

import java.util.Set;
@Deprecated
public class UserContactService implements IUserContactService{
    private static UserContactService service = null;
    private UserContactRepository repo = null;

    private UserContactService(){
        this.repo = UserContactRepository.getRepository();
    }

    public static UserContactService getService(){
        if(service == null){
            service =new UserContactService();
        }
        return service;
    }


    @Override
    public UserContact create(UserContact userContact) {
        return this.repo.create(userContact);
    }

    @Override
    public UserContact read(String s) {
        return this.repo.read(s);
    }

    @Override
    public UserContact update(UserContact userContact) {
        return this.repo.update(userContact);
    }

    @Override
    public boolean delete(String s) {
        return this.repo.delete(s);
    }

    @Override
    public Set<UserContact> getAll() {
        return this.repo.getAll();
    }

    public Set<UserContact> getSingleUserContact() {
        Set<UserContact> SingleUserContact =null;
        Set<UserContact> UserContactSet = getAll();

        for (UserContact userContact : UserContactSet)
        {
            if(userContact.toString().trim().toUpperCase().contains("A")){
                SingleUserContact.add(userContact);
            }
        }
        return SingleUserContact;
    }

}
