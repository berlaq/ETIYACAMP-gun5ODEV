package gun5odev1.business.concretes;

import gun5odev1.Entities.concretes.Guest;
import gun5odev1.Entities.concretes.RegisteredUser;
import gun5odev1.business.abstracts.UserService;
import gun5odev1.core.abstacts.ValidationService;
import gun5odev1.dataAccess.abstracts.UserDao;


public class UserManager implements UserService {

    ValidationService validationService;
    UserDao userDao;

    public UserManager(ValidationService validationService, UserDao userDao) {
        this.validationService = validationService;
        this.userDao=userDao;
    }

    @Override
    public void register(Guest guest) {
        if(validationService.isRegisterValid(guest)){
            userDao.add(guest);
        }else {
            System.out.println("Anasayfaya yönlendiriliyor");
        }
    }

    @Override
    public void login(Guest guest) {
        if(validationService.isLoginValid(guest)){
            System.out.println("Giriş yapıldı");
        }else{
            System.out.println("Hata! Google ile giriş yapılamadı");
        }
    }
}
