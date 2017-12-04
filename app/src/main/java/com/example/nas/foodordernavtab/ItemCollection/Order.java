package com.example.nas.foodordernavtab.ItemCollection;

/**
 * Created by nas on 30/11/2017.
 */

public class Order {

    String nama;
    Float nombor;
    Double harga;

    public Order() {

    }

    public String getNama() {
        return nama;
    }

    public Float getNombor() {
        return nombor;
    }

    public Double getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNombor(Float nombor) {
        this.nombor = nombor;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
}
