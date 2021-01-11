package com.example.salon_za_avtomobili.model.views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kupenivozilaodklient", schema = "public", catalog = "salon_za_avtomobili")
public class KupeniVozilaOdKlient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ime;
    private String prezime;
    private Long count;
    private Long promet;

    @Basic
    @Column(name = "ime")
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Basic
    @Column(name = "prezime")
    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Basic
    @Column(name = "count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Basic
    @Column(name = "promet")
    public Long getPromet() {
        return promet;
    }

    public void setPromet(Long promet) {
        this.promet = promet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KupeniVozilaOdKlient that = (KupeniVozilaOdKlient) o;
        return Objects.equals(ime, that.ime) && Objects.equals(prezime, that.prezime) && Objects.equals(count, that.count) && Objects.equals(promet, that.promet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, count, promet);
    }
}
