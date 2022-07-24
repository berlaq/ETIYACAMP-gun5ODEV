package gun5odev1.business.abstracts;

import gun5odev1.Entities.concretes.Guest;
import gun5odev1.Entities.concretes.RegisteredUser;
import gun5odev1.dataAccess.abstracts.UserDao;

public interface UserService {

    void register(Guest guest);
    void login(Guest guest);

}
