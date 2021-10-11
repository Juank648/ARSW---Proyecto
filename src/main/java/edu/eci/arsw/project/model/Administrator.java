package edu.eci.arsw.project.model;

import javax.persistence.Entity;

//@Entity(name="Administrators")
public class Administrator extends User{
    public String mail;
    public String passwd;


    public Administrator(String role, String nickname) {
        super(role, nickname);
    }

    public Administrator() {

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
