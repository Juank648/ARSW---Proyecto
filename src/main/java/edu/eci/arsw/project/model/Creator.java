package edu.eci.arsw.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="creators")
public class Creator extends User{

    @Column
    public String mail;
    @Column
    public String passwd;

    public Creator(String nickname, String mail, String passwd) {

        super(nickname);
        this.mail=mail;
        this.passwd=passwd;
    }

    public Creator() {

        super();
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
