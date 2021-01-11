package com.example.salon_za_avtomobili.model.tables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prodazba", schema = "public", catalog = "salon_za_avtomobili")
@IdClass(ProdazbaPK.class)
public class Prodazba {
    private String vin;
    private int avtomobilid;
    private String embgKlient;
    private String embgVraboten;
    private Date vremeNaKreiranje;

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

    @Id
    @Column(name = "embg_klient")
    public String getEmbgKlient() {
        return embgKlient;
    }

    public void setEmbgKlient(String embgKlient) {
        this.embgKlient = embgKlient;
    }

    @Id
    @Column(name = "embg_vraboten")
    public String getEmbgVraboten() {
        return embgVraboten;
    }

    public void setEmbgVraboten(String embgVraboten) {
        this.embgVraboten = embgVraboten;
    }

    @Basic
    @Column(name = "vreme_na_kreiranje")
    public Date getVremeNaKreiranje() {
        return vremeNaKreiranje;
    }

    public void setVremeNaKreiranje(Date vremeNaKreiranje) {
        this.vremeNaKreiranje = vremeNaKreiranje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodazba that = (Prodazba) o;
        return avtomobilid == that.avtomobilid && Objects.equals(vin, that.vin) && Objects.equals(embgKlient, that.embgKlient) && Objects.equals(embgVraboten, that.embgVraboten) && Objects.equals(vremeNaKreiranje, that.vremeNaKreiranje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, avtomobilid, embgKlient, embgVraboten, vremeNaKreiranje);
    }
}
