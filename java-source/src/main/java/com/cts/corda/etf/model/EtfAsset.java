package com.cts.corda.etf.model;


import net.corda.core.serialization.CordaSerializable;

import java.util.Objects;

@CordaSerializable
public class EtfAsset {

    private String etfName;
    private Long quantity;

    public EtfAsset(String etfName, Long quantity) {
        this.etfName = etfName;
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getEtfName() {
        return etfName;
    }

    public void setEtfName(String etfName) {
        this.etfName = etfName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtfAsset etfAsset = (EtfAsset) o;
        return quantity == etfAsset.quantity &&
                Objects.equals(etfName, etfAsset.etfName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(etfName, quantity);
    }

    @Override
    public String toString() {
        return "EtfAsset{" +
                "etfName='" + etfName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
