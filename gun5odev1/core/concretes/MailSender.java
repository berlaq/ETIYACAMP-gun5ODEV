package gun5odev1.core.concretes;

import gun5odev1.Entities.concretes.Guest;
import gun5odev1.core.abstacts.MailService;

public class MailSender implements MailService {
    @Override
    public void sendMail(Guest guest) {
        System.out.println("Mail gönderildi");
    }

    @Override
    public boolean receiver() {
        return true;
    }
}
