package gun5odev1.core.abstacts;

import gun5odev1.Entities.abstacts.IEntitiy;
import gun5odev1.Entities.concretes.Guest;
import gun5odev1.Entities.concretes.RegisteredUser;
import gun5odev1.business.abstracts.UserService;
import gun5odev1.dataAccess.abstracts.UserDao;

public interface ValidationService {
    boolean isRegisterValid(Guest guest);
    boolean isLoginValid(Guest guest);
}
