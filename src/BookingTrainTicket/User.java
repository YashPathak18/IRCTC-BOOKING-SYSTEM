package BookingTrainTicket;

public class User {

    private String username;

    private String passowrd;

    private String fullname;

    private int contact;

    public User(String username, String passowrd, String fullname, int contact) {
        this.username = username;
        this.passowrd = passowrd;
        this.fullname = fullname;
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString(){
        return fullname+"("+username+")";
    }
}
