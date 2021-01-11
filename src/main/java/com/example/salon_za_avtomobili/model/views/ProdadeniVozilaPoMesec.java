package com.example.salon_za_avtomobili.model.views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "prodadenivozilapomesec", schema = "public", catalog = "salon_za_avtomobili")
public class ProdadeniVozilaPoMesec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marka;
    private String model;
    private int mesec;
    private Long prodadeni;

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
    @Column(name = "mesec")
    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    @Basic
    @Column(name = "prodadeni")
    public Long getProdadeni() {
        return prodadeni;
    }

    public void setProdadeni(Long prodadeni) {
        this.prodadeni = prodadeni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdadeniVozilaPoMesec that = (ProdadeniVozilaPoMesec) o;
        return Objects.equals(marka, that.marka) && Objects.equals(model, that.model) && Objects.equals(mesec, that.mesec) && Objects.equals(prodadeni, that.prodadeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, mesec, prodadeni);
    }
}
