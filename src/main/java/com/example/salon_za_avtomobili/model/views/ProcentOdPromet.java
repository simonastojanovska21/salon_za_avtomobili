package com.example.salon_za_avtomobili.model.views;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;


@Entity
@Table(name = "procentodpromet", schema = "public", catalog = "salon_za_avtomobili")
public class ProcentOdPromet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ime;
    private Long promet;
    private Double procent;

    @Basic
    @Column(name = "ime")
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Basic
    @Column(name = "promet")
    public Long getPromet() {
        return promet;
    }

    public void setPromet(Long promet) {
        this.promet = promet;
    }

    @Basic
    @Column(name = "procent")
    public Double getProcent() {
        return procent;
    }

    public void setProcent(Double procent) {
        this.procent = procent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcentOdPromet that = (ProcentOdPromet) o;
        return Objects.equals(ime, that.ime) && Objects.equals(promet, that.promet) && Objects.equals(procent, that.procent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, promet, procent);
    }
}
