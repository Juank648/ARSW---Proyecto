package edu.eci.arsw.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "administrators")
public class Administrator extends User{

    @Column
    private String mail;
    @Column
    public String passwd;


    public Administrator(String nickname, String mail, String passwd) {

        super(nickname);
        this.mail=mail;
        this.passwd=passwd;

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
