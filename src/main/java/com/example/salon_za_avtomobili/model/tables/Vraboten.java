package com.example.salon_za_avtomobili.model.tables;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "vraboten", schema = "public", catalog = "salon_za_avtomobili")
public class Vraboten {
    private String embg;
    private String ime;
    private String prezime;
    private String telefonskiBroj;
    private String adresa;
    private Date datumNaVrabotuvanje;
    private String embgShef;
    private Integer salonid;
    private String embgShefEmbg;
    private Integer salonidSalonid;

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

    @Basic
    @Column(name = "datum_na_vrabotuvanje")
    public Date getDatumNaVrabotuvanje() {
        return datumNaVrabotuvanje;
    }

    public void setDatumNaVrabotuvanje(Date datumNaVrabotuvanje) {
        this.datumNaVrabotuvanje = datumNaVrabotuvanje;
    }

    @Basic
    @Column(name = "embg_shef")
    public String getEmbgShef() {
        return embgShef;
    }

    public void setEmbgShef(String embgShef) {
        this.embgShef = embgShef;
    }

    @Basic
    @Column(name = "salonid")
    public Integer getSalonid() {
        return salonid;
    }

    public void setSalonid(Integer salonid) {
        this.salonid = salonid;
    }

    @Basic
    @Column(name = "embg_shef_embg")
    public String getEmbgShefEmbg() {
        return embgShefEmbg;
    }

    public void setEmbgShefEmbg(String embgShefEmbg) {
        this.embgShefEmbg = embgShefEmbg;
    }

    @Basic
    @Column(name = "salonid_salonid")
    public Integer getSalonidSalonid() {
        return salonidSalonid;
    }

    public void setSalonidSalonid(Integer salonidSalonid) {
        this.salonidSalonid = salonidSalonid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vraboten that = (Vraboten) o;
        return Objects.equals(embg, that.embg) && Objects.equals(ime, that.ime) && Objects.equals(prezime, that.prezime) && Objects.equals(telefonskiBroj, that.telefonskiBroj) && Objects.equals(adresa, that.adresa) && Objects.equals(datumNaVrabotuvanje, that.datumNaVrabotuvanje) && Objects.equals(embgShef, that.embgShef) && Objects.equals(salonid, that.salonid) && Objects.equals(embgShefEmbg, that.embgShefEmbg) && Objects.equals(salonidSalonid, that.salonidSalonid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(embg, ime, prezime, telefonskiBroj, adresa, datumNaVrabotuvanje, embgShef, salonid, embgShefEmbg, salonidSalonid);
    }
}
