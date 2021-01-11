package com.example.salon_za_avtomobili.model.views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "prikaznaprimeroci", schema = "public", catalog = "salon_za_avtomobili")
public class PrikazNaPrimeroci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ime;
    private String marka;
    private String model;
    private Long primeroci;
    private Integer cena;

    @Basic
    @Column(name = "ime")
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
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
    @Column(name = "primeroci")
    public Long getPrimeroci() {
        return primeroci;
    }

    public void setPrimeroci(Long primeroci) {
        this.primeroci = primeroci;
    }

    @Basic
    @Column(name = "cena")
    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrikazNaPrimeroci that = (PrikazNaPrimeroci) o;
        return Objects.equals(ime, that.ime) && Objects.equals(marka, that.marka) && Objects.equals(model, that.model) && Objects.equals(primeroci, that.primeroci) && Objects.equals(cena, that.cena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, marka, model, primeroci, cena);
    }
}
