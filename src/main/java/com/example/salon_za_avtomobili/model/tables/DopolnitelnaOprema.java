package com.example.salon_za_avtomobili.model.tables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dopolnitelnaoprema", schema = "public", catalog = "salon_za_avtomobili")
public class DopolnitelnaOprema {
    private int opremaid;
    private String naziv;
    private Integer cena;
    private int narackaid;
    private Integer narackaidNarackaid;

    public DopolnitelnaOprema(int i, String naziv, int cena, int i1) {
        this.opremaid=i;
        this.naziv=naziv;
        this.cena=cena;
        this.narackaid=i1;
    }

    @Id
    @Column(name = "opremaid")
    public int getOpremaid() {
        return opremaid;
    }

    public void setOpremaid(int opremaid) {
        this.opremaid = opremaid;
    }

    @Basic
    @Column(name = "naziv")
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
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
    @Column(name = "narackaid")
    public int getNarackaid() {
        return narackaid;
    }

    public void setNarackaid(int narackaid) {
        this.narackaid = narackaid;
    }

    @Basic
    @Column(name = "narackaid_narackaid")
    public Integer getNarackaidNarackaid() {
        return narackaidNarackaid;
    }

    public void setNarackaidNarackaid(Integer narackaidNarackaid) {
        this.narackaidNarackaid = narackaidNarackaid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DopolnitelnaOprema that = (DopolnitelnaOprema) o;
        return opremaid == that.opremaid && narackaid == that.narackaid && Objects.equals(naziv, that.naziv) && Objects.equals(cena, that.cena) && Objects.equals(narackaidNarackaid, that.narackaidNarackaid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opremaid, naziv, cena, narackaid, narackaidNarackaid);
    }
}
