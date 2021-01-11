package com.example.salon_za_avtomobili.model.tables;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "salon", schema = "public", catalog = "salon_za_avtomobili")
public class Salon {
    private int salonid;
    private String imeGrad;
    private String adresa;
    private String telefonskiBroj;
    private String ime;

    @Id
    @Column(name = "salonid")
    public int getSalonid() {
        return salonid;
    }

    public void setSalonid(int salonid) {
        this.salonid = salonid;
    }

    @Basic
    @Column(name = "ime_grad")
    public String getImeGrad() {
        return imeGrad;
    }

    public void setImeGrad(String imeGrad) {
        this.imeGrad = imeGrad;
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
    @Column(name = "telefonski_broj")
    public String getTelefonskiBroj() {
        return telefonskiBroj;
    }

    public void setTelefonskiBroj(String telefonskiBroj) {
        this.telefonskiBroj = telefonskiBroj;
    }

    @Basic
    @Column(name = "ime")
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salon that = (Salon) o;
        return salonid == that.salonid && Objects.equals(imeGrad, that.imeGrad) && Objects.equals(adresa, that.adresa) && Objects.equals(telefonskiBroj, that.telefonskiBroj) && Objects.equals(ime, that.ime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salonid, imeGrad, adresa, telefonskiBroj, ime);
    }
}
