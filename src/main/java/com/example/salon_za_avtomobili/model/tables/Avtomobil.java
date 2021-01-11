package com.example.salon_za_avtomobili.model.tables;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "avtomobil", schema = "public", catalog = "salon_za_avtomobili")
public class Avtomobil {
    private int avtomobilid;
    private String marka;
    private String model;
    private String gorivo;
    private String stilNaKaroserija;
    private Integer godinaNaProizvodstvo;
    private String menuvac;
    private Integer brojNaSedista;

    @Id
    @Column(name = "avtomobilid")
    public int getAvtomobilid() {
        return avtomobilid;
    }

    public void setAvtomobilid(int avtomobilid) {
        this.avtomobilid = avtomobilid;
    }

    @Basic
    @Column(name = "marka")
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "gorivo")
    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }

    @Basic
    @Column(name = "stil_na_karoserija")
    public String getStilNaKaroserija() {
        return stilNaKaroserija;
    }

    public void setStilNaKaroserija(String stilNaKaroserija) {
        this.stilNaKaroserija = stilNaKaroserija;
    }

    @Basic
    @Column(name = "godina_na_proizvodstvo")
    public Integer getGodinaNaProizvodstvo() {
        return godinaNaProizvodstvo;
    }

    public void setGodinaNaProizvodstvo(Integer godinaNaProizvodstvo) {
        this.godinaNaProizvodstvo = godinaNaProizvodstvo;
    }

    @Basic
    @Column(name = "menuvac")
    public String getMenuvac() {
        return menuvac;
    }

    public void setMenuvac(String menuvac) {
        this.menuvac = menuvac;
    }

    @Basic
    @Column(name = "broj_na_sedista")
    public Integer getBrojNaSedista() {
        return brojNaSedista;
    }

    public void setBrojNaSedista(Integer brojNaSedista) {
        this.brojNaSedista = brojNaSedista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avtomobil that = (Avtomobil) o;
        return avtomobilid == that.avtomobilid && Objects.equals(marka, that.marka) && Objects.equals(model, that.model) && Objects.equals(gorivo, that.gorivo) && Objects.equals(stilNaKaroserija, that.stilNaKaroserija) && Objects.equals(godinaNaProizvodstvo, that.godinaNaProizvodstvo) && Objects.equals(menuvac, that.menuvac) && Objects.equals(brojNaSedista, that.brojNaSedista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avtomobilid, marka, model, gorivo, stilNaKaroserija, godinaNaProizvodstvo, menuvac, brojNaSedista);
    }
}
