package gun5odev1.core.concretes;

import gun5odev1.Entities.concretes.Guest;
import gun5odev1.core.abstacts.ValidationService;

public class GoogleValidationAdapter implements ValidationService {
    @Override
    public boolean isRegisterValid(Guest guest) {
        //google api kodları
        return true;
    }

    @Override
    public boolean isLoginValid(Guest guest) {
        //google api kodları
        return true;
    }
}
