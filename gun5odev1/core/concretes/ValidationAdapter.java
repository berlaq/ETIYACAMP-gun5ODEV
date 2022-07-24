package gun5odev1.core.concretes;

import gun5odev1.Entities.concretes.Guest;
import gun5odev1.Entities.concretes.RegisteredUser;
import gun5odev1.core.abstacts.MailService;
import gun5odev1.core.abstacts.ValidationService;
import gun5odev1.dataAccess.abstracts.UserDao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationAdapter implements ValidationService {

    MailService mailService;
    UserDao userDao;

    public ValidationAdapter(MailService mailService, UserDao userDao) {
        this.mailService = mailService;
        this.userDao = userDao;
    }

    @Override
    public boolean isRegisterValid(Guest guest) {

        boolean status = false;
        try{
            String pattern = "^[a-zA-Z0-9+_.-]+@[a-z\\d]+[.][a-z]+$";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(guest.geteMail());

            if(guest.getPassword().length()!=6){
                throw new RuntimeException("Parola en az 6 haneli olmalı");
            } else if (!m.find()) {
                throw new RuntimeException("Mail hesabı geçersiz");
            } else if (m.find()) {
                for (RegisteredUser tempMails: userDao.getAll()) {
                    if(tempMails.geteMail()==guest.geteMail()){
                        throw new RuntimeException("Daha önce kullanılmış mail!!");
                    }
                }
            } else if (guest.getFirstName().length()<2 || guest.getLastName().length()<2) {
                throw new RuntimeException("İsim ve soyisim 2 karakterden az olamaz!");
            } else {
                mailService.sendMail(guest);
                if(mailService.receiver()){
                    status=true;
                    System.out.println("KAYIT BAŞARILI");
                }else {
                    throw new RuntimeException("Doğrulama linki geçersiz");
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("KAYIT BAŞARISIZ!!");
        }
        return status;
    }

    @Override
    public boolean isLoginValid(Guest guest) {
        boolean status = false;
        if(userDao.getByLogin(guest)==null){
            throw new RuntimeException("E posta ya da şifre hatalı");
        }else {
            status=true;
        }
        return status;
    }
}
