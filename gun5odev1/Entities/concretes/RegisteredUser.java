package gun5odev1.Entities.concretes;

import gun5odev1.Entities.abstacts.IEntitiy;

public class RegisteredUser implements IEntitiy {
    private int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;

    public RegisteredUser(Guest guest) {
        this.id = guest.getId();
        this.firstName = guest.getFirstName();
        this.lastName = guest.getLastName();
        this.eMail = guest.geteMail();
        this.password = guest.getPassword();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
