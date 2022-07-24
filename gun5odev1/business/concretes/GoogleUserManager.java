package gun5odev1.business.concretes;

import gun5odev1.Entities.concretes.Guest;
import gun5odev1.Entities.concretes.RegisteredUser;
import gun5odev1.business.abstracts.UserService;
import gun5odev1.core.abstacts.ValidationService;
import gun5odev1.dataAccess.abstracts.UserDao;

public class GoogleUserManager implements UserService {

    UserDao userDao;
    ValidationService validationService;

    public GoogleUserManager(UserDao userDao, ValidationService validationService) {
        this.userDao = userDao;
        this.validationService= validationService;
    }

    @Override
    public void register(Guest guest) {
        if(validationService.isRegisterValid(guest)){
            //kalan bilgiler googledan alınır
            userDao.add(guest);
        }else{
            System.out.println("Hata! Google ile kayıt yapılamadı");
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
