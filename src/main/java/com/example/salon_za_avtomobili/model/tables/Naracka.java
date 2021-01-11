package com.example.salon_za_avtomobili.model.tables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "naracka", schema = "public", catalog = "salon_za_avtomobili")
public class Naracka {
    private int narackaid;
    private Date vremeNaIsporacuvanje;
    private String vin;
    private int avtomobilid;
    private String embgKlient;
    private String embgVraboten;
    private Integer avtomobilidAvtomobilid;
    private String embgKlientEmbg;
    private String embgVrabotenEmbg;
    private Integer vinAvtomobilid;
    private String vinVin;

    public Naracka(int i, Date date, String vin, int avtomobil, String embgKlient, String embgVraboten) {
        this.narackaid=i;
        this.vremeNaIsporacuvanje=date;
        this.vin=vin;
        this.avtomobilid=avtomobil;
        this.embgKlient=embgKlient;
        this.embgVraboten=embgVraboten;
    }

    @Id
    @Column(name = "narackaid")
    public int getNarackaid() {
        return narackaid;
    }

    public void setNarackaid(int narackaid) {
        this.narackaid = narackaid;
    }

    @Basic
    @Column(name = "vreme_na_isporacuvanje")
    public Date getVremeNaIsporacuvanje() {
        return vremeNaIsporacuvanje;
    }

    public void setVremeNaIsporacuvanje(Date vremeNaIsporacuvanje) {
        this.vremeNaIsporacuvanje = vremeNaIsporacuvanje;
    }

    @Basic
    @Column(name = "vin")
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Basic
    @Column(name = "avtomobilid")
    public int getAvtomobilid() {
        return avtomobilid;
    }

    public void setAvtomobilid(int avtomobilid) {
        this.avtomobilid = avtomobilid;
    }

    @Basic
    @Column(name = "embg_klient")
    public String getEmbgKlient() {
        return embgKlient;
    }

    public void setEmbgKlient(String embgKlient) {
        this.embgKlient = embgKlient;
    }

    @Basic
    @Column(name = "embg_vraboten")
    public String getEmbgVraboten() {
        return embgVraboten;
    }

    public void setEmbgVraboten(String embgVraboten) {
        this.embgVraboten = embgVraboten;
    }

    @Basic
    @Column(name = "avtomobilid_avtomobilid")
    public Integer getAvtomobilidAvtomobilid() {
        return avtomobilidAvtomobilid;
    }

    public void setAvtomobilidAvtomobilid(Integer avtomobilidAvtomobilid) {
        this.avtomobilidAvtomobilid = avtomobilidAvtomobilid;
    }

    @Basic
    @Column(name = "embg_klient_embg")
    public String getEmbgKlientEmbg() {
        return embgKlientEmbg;
    }

    public void setEmbgKlientEmbg(String embgKlientEmbg) {
        this.embgKlientEmbg = embgKlientEmbg;
    }

    @Basic
    @Column(name = "embg_vraboten_embg")
    public String getEmbgVrabotenEmbg() {
        return embgVrabotenEmbg;
    }

    public void setEmbgVrabotenEmbg(String embgVrabotenEmbg) {
        this.embgVrabotenEmbg = embgVrabotenEmbg;
    }

    @Basic
    @Column(name = "vin_avtomobilid")
    public Integer getVinAvtomobilid() {
        return vinAvtomobilid;
    }

    public void setVinAvtomobilid(Integer vinAvtomobilid) {
        this.vinAvtomobilid = vinAvtomobilid;
    }

    @Basic
    @Column(name = "vin_vin")
    public String getVinVin() {
        return vinVin;
    }

    public void setVinVin(String vinVin) {
        this.vinVin = vinVin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Naracka that = (Naracka) o;
        return narackaid == that.narackaid && avtomobilid == that.avtomobilid && Objects.equals(vremeNaIsporacuvanje, that.vremeNaIsporacuvanje) && Objects.equals(vin, that.vin) && Objects.equals(embgKlient, that.embgKlient) && Objects.equals(embgVraboten, that.embgVraboten) && Objects.equals(avtomobilidAvtomobilid, that.avtomobilidAvtomobilid) && Objects.equals(embgKlientEmbg, that.embgKlientEmbg) && Objects.equals(embgVrabotenEmbg, that.embgVrabotenEmbg) && Objects.equals(vinAvtomobilid, that.vinAvtomobilid) && Objects.equals(vinVin, that.vinVin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(narackaid, vremeNaIsporacuvanje, vin, avtomobilid, embgKlient, embgVraboten, avtomobilidAvtomobilid, embgKlientEmbg, embgVrabotenEmbg, vinAvtomobilid, vinVin);
    }
}
