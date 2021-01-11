package com.example.salon_za_avtomobili.model.views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "prometpomeseci", schema = "public", catalog = "salon_za_avtomobili")
public class PrometPoMeseci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ime;
    private int mesec;
    private int godina;
    private Long promet;
    private Long prodadenivozila;

    @Basic
    @Column(name = "ime")
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Basic
    @Column(name = "mesec")
    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    @Basic
    @Column(name = "godina")
    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
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
    @Column(name = "prodadenivozila")
    public Long getProdadenivozila() {
        return prodadenivozila;
    }

    public void setProdadenivozila(Long prodadenivozila) {
        this.prodadenivozila = prodadenivozila;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrometPoMeseci that = (PrometPoMeseci) o;
        return Objects.equals(ime, that.ime) && Objects.equals(mesec, that.mesec) && Objects.equals(godina, that.godina) && Objects.equals(promet, that.promet) && Objects.equals(prodadenivozila, that.prodadenivozila);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, mesec, godina, promet, prodadenivozila);
    }
}
