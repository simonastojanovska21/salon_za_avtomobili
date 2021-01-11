package com.example.salon_za_avtomobili.model.tables;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "primerok", schema = "public", catalog = "salon_za_avtomobili")
@IdClass(PrimerokPK.class)
public class Primerok {
    private String vin;
    private int avtomobilid;
    private Integer cena;
    private int salonid;
    private String dostapen;
    private Integer salonidSalonid;

    @Id
    @Column(name = "vin")
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Id
    @Column(name = "avtomobilid")
    public int getAvtomobilid() {
        return avtomobilid;
    }

    public void setAvtomobilid(int avtomobilid) {
        this.avtomobilid = avtomobilid;
    }

    @Basic
    @Column(name = "cena")
    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    @Basic
    @Column(name = "salonid")
    public int getSalonid() {
        return salonid;
    }

    public void setSalonid(int salonid) {
        this.salonid = salonid;
    }

    @Basic
    @Column(name = "dostapen")
    public String getDostapen() {
        return dostapen;
    }

    public void setDostapen(String dostapen) {
        this.dostapen = dostapen;
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
        Primerok that = (Primerok) o;
        return avtomobilid == that.avtomobilid && salonid == that.salonid && Objects.equals(vin, that.vin) && Objects.equals(cena, that.cena) && Objects.equals(dostapen, that.dostapen) && Objects.equals(salonidSalonid, that.salonidSalonid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, avtomobilid, cena, salonid, dostapen, salonidSalonid);
    }
}
