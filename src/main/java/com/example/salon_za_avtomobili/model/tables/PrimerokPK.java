package com.example.salon_za_avtomobili.model.tables;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PrimerokPK implements Serializable {
    private String vin;
    private int avtomobilid;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimerokPK that = (PrimerokPK) o;
        return avtomobilid == that.avtomobilid && Objects.equals(vin, that.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, avtomobilid);
    }
}
