package gun5odev1;

import gun5odev1.Entities.concretes.Guest;
import gun5odev1.Entities.concretes.RegisteredUser;
import gun5odev1.business.abstracts.UserService;
import gun5odev1.business.concretes.UserManager;
import gun5odev1.core.abstacts.MailService;
import gun5odev1.core.abstacts.ValidationService;
import gun5odev1.core.concretes.MailSender;
import gun5odev1.core.concretes.ValidationAdapter;
import gun5odev1.dataAccess.abstracts.UserDao;
import gun5odev1.dataAccess.concretes.HibernateProductDao;

public class Main {
    public static void main(String[] args){



        MailService mailService1 = new MailSender();


        Guest guest1 = new Guest(1,"berkay","haberal","xdxd@xd.com","123456");
        UserDao userDao1= new HibernateProductDao();
        ValidationService validationService1 = new ValidationAdapter(mailService1,userDao1);
        UserService userService1 = new UserManager(validationService1,userDao1);
        userService1.register(guest1);

        //veritabanındaki kayıt örneği;
        RegisteredUser registeredUser1 = new RegisteredUser(guest1);

        userService1.login(guest1);

    }
}
