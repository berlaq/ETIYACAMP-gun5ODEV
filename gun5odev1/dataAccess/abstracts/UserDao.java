package gun5odev1.dataAccess.abstracts;

import gun5odev1.Entities.concretes.Guest;
import gun5odev1.Entities.concretes.RegisteredUser;

import java.util.List;

public interface UserDao {

    void add(Guest guest);
    void delete(RegisteredUser registeredUser);
    void update(RegisteredUser registeredUser);
    List<RegisteredUser> getAll();
    RegisteredUser getByLogin(Guest guest);

    Guest guestInfo(Guest guest);


}
