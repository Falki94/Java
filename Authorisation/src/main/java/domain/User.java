package domain;

public class User {
    private String name;
    private String password;
    private String confirmedPassword;
    private String Email;
    private UserType userType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public UserType getUserType() {
        return userType;
    }

 
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
