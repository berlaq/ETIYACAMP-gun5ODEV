package gun5odev1.core.abstacts;

import gun5odev1.Entities.concretes.Guest;

public interface MailService {
    void sendMail(Guest guest);
    boolean receiver();
}
