package com.example.salon_za_avtomobili.model.tables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "klient", schema = "public", catalog = "salon_za_avtomobili")
public class Klient {
    private String embg;
    private String ime;
    private String prezime;
    private String telefonskiBroj;
    private String adresa;

    @Id
    @Column(name = "embg")
    public String getEmbg() {
        return embg;
    }

    public void setEmbg(String embg) {
        this.embg = embg;
    }

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
    @Column(name = "telefonski_broj")
    public String getTelefonskiBroj() {
        return telefonskiBroj;
    }

    public void setTelefonskiBroj(String telefonskiBroj) {
        this.telefonskiBroj = telefonskiBroj;
    }

    @Basic
    @Column(name = "adresa")
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient that = (Klient) o;
        return Objects.equals(embg, that.embg) && Objects.equals(ime, that.ime) && Objects.equals(prezime, that.prezime) && Objects.equals(telefonskiBroj, that.telefonskiBroj) && Objects.equals(adresa, that.adresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(embg, ime, prezime, telefonskiBroj, adresa);
    }
}
