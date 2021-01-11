package com.example.salon_za_avtomobili.model.views;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "neisporacaninaracki", schema = "public", catalog = "salon_za_avtomobili")
public class NeisporacaiNaracki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marka;
    private String model;
    private String vin;
    private String imeKlient;
    private String prezimeKlient;
    private String vrabotenIme;
    private String vrabotenPrezime;
    private Date vremeNaIsporacuvanje;

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
    @Column(name = "vin")
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Basic
    @Column(name = "ime_klient")
    public String getImeKlient() {
        return imeKlient;
    }

    public void setImeKlient(String imeKlient) {
        this.imeKlient = imeKlient;
    }

    @Basic
    @Column(name = "prezime_klient")
    public String getPrezimeKlient() {
        return prezimeKlient;
    }

    public void setPrezimeKlient(String prezimeKlient) {
        this.prezimeKlient = prezimeKlient;
    }

    @Basic
    @Column(name = "vraboten_ime")
    public String getVrabotenIme() {
        return vrabotenIme;
    }

    public void setVrabotenIme(String vrabotenIme) {
        this.vrabotenIme = vrabotenIme;
    }

    @Basic
    @Column(name = "vraboten_prezime")
    public String getVrabotenPrezime() {
        return vrabotenPrezime;
    }

    public void setVrabotenPrezime(String vrabotenPrezime) {
        this.vrabotenPrezime = vrabotenPrezime;
    }

    @Basic
    @Column(name = "vreme_na_isporacuvanje")
    public Date getVremeNaIsporacuvanje() {
        return vremeNaIsporacuvanje;
    }

    public void setVremeNaIsporacuvanje(Date vremeNaIsporacuvanje) {
        this.vremeNaIsporacuvanje = vremeNaIsporacuvanje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NeisporacaiNaracki that = (NeisporacaiNaracki) o;
        return Objects.equals(marka, that.marka) && Objects.equals(model, that.model) && Objects.equals(vin, that.vin) && Objects.equals(imeKlient, that.imeKlient) && Objects.equals(prezimeKlient, that.prezimeKlient) && Objects.equals(vrabotenIme, that.vrabotenIme) && Objects.equals(vrabotenPrezime, that.vrabotenPrezime) && Objects.equals(vremeNaIsporacuvanje, that.vremeNaIsporacuvanje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, vin, imeKlient, prezimeKlient, vrabotenIme, vrabotenPrezime, vremeNaIsporacuvanje);
    }
}
