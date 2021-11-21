package edu.eci.arsw.project.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "rooms")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "money", nullable = false)
    private Integer money;

    @Column(name = "bank", nullable = false)
    private Integer bank;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idcreator", nullable = false)
    private Creator idcreator;

    @Column(name = "\"time\"", nullable = false)
    private Integer time;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Creator getIdcreator() {
        return idcreator;
    }

    public void setIdcreator(Creator idcreator) {
        this.idcreator = idcreator;
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
