package edu.eci.arsw.project.model;

public class Creator extends User{

    public String mail;
    public String passwd;

    public Creator(String role, String nickname) {
        super(role, nickname);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
