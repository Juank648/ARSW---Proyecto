package edu.eci.arsw.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Objects;

@Entity
@Table(name = "administrators")
public class Administrator extends User{

    @Column
    private String mail;
    @Column
    private String passwd;
    @Transient
    private String confirmPasswd;


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

    public String getConfirmPasswd() {
        return confirmPasswd;
    }

    public void setConfirmPasswd(String confirmPasswd) {
        this.confirmPasswd = confirmPasswd;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "mail='" + mail + '\'' +
                ", passwd='" + passwd + '\'' +
                ", confirmPasswd='" + confirmPasswd + '\'' +
                ", id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Administrator that = (Administrator) o;
        return mail.equals(that.mail) && passwd.equals(that.passwd) && confirmPasswd.equals(that.confirmPasswd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mail, passwd, confirmPasswd);
    }
}
