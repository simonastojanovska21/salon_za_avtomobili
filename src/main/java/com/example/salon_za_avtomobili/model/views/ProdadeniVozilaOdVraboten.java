package com.example.salon_za_avtomobili.model.views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "prodadenivozilaodvraboten", schema = "public", catalog = "salon_za_avtomobili")
public class ProdadeniVozilaOdVraboten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ime;
    private String prezime;
    private String adresa;
    private String salon;
    private Long prodadenivozila;
    private int mesec;

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
    @Column(name = "adresa")
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Basic
    @Column(name = "salon")
    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Basic
    @Column(name = "prodadenivozila")
    public Long getProdadenivozila() {
        return prodadenivozila;
    }

    public void setProdadenivozila(Long prodadenivozila) {
        this.prodadenivozila = prodadenivozila;
    }

    @Basic
    @Column(name = "mesec")
    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdadeniVozilaOdVraboten that = (ProdadeniVozilaOdVraboten) o;
        return Objects.equals(ime, that.ime) && Objects.equals(prezime, that.prezime) && Objects.equals(adresa, that.adresa) && Objects.equals(salon, that.salon) && Objects.equals(prodadenivozila, that.prodadenivozila) && Objects.equals(mesec, that.mesec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, adresa, salon, prodadenivozila, mesec);
    }
}
