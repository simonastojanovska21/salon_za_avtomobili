package com.example.salon_za_avtomobili.model.tables;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProdazbaPK implements Serializable {
    private String vin;
    private int avtomobilid;
    private String embgKlient;
    private String embgVraboten;

    @Column(name = "vin")
    @Id
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Column(name = "avtomobilid")
    @Id
    public int getAvtomobilid() {
        return avtomobilid;
    }

    public void setAvtomobilid(int avtomobilid) {
        this.avtomobilid = avtomobilid;
    }

    @Column(name = "embg_klient")
    @Id
    public String getEmbgKlient() {
        return embgKlient;
    }

    public void setEmbgKlient(String embgKlient) {
        this.embgKlient = embgKlient;
    }

    @Column(name = "embg_vraboten")
    @Id
    public String getEmbgVraboten() {
        return embgVraboten;
    }

    public void setEmbgVraboten(String embgVraboten) {
        this.embgVraboten = embgVraboten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdazbaPK that = (ProdazbaPK) o;
        return avtomobilid == that.avtomobilid && Objects.equals(vin, that.vin) && Objects.equals(embgKlient, that.embgKlient) && Objects.equals(embgVraboten, that.embgVraboten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, avtomobilid, embgKlient, embgVraboten);
    }
}
