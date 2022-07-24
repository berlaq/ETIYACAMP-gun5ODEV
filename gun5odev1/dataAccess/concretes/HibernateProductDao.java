package gun5odev1.dataAccess.concretes;


import gun5odev1.Entities.concretes.Guest;
import gun5odev1.Entities.concretes.RegisteredUser;
import gun5odev1.dataAccess.abstracts.UserDao;

import java.util.List;

public class HibernateProductDao implements UserDao {


    @Override
    public void add(Guest guest) {
        System.out.println("sisteme kayıt edildi");
    }

    @Override
    public void delete(RegisteredUser registeredUser) {
        System.out.println("Sistemden silindi");
    }

    @Override
    public void update(RegisteredUser registeredUser) {
        System.out.println("Kullanıcı güncellendi");
    }

    @Override
    public List<RegisteredUser> getAll() {
        return null;
    }

    @Override
    public RegisteredUser getByLogin(Guest guest) {
        //guest mailine göre veritabanı sorgusu yapılır
        return new RegisteredUser(guest);
    }

    @Override
    public Guest guestInfo(Guest guest) {
        return guest;
    }
}
