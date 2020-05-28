package com.aa183.pranata;

import com.google.gson.annotations.SerializedName;

public class Books {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("cerita")
    private String cerita;
    @SerializedName("genre")
    private String genre;
    @SerializedName("status")
    private int status;
    @SerializedName("tanggal")
    private String tanggal;
    @SerializedName("picture")
    private String picture;
    @SerializedName("cek")
    private Boolean cek;
    @SerializedName("value")
    private String value;
    @SerializedName("message")
    private String massage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCerita() {
        return cerita;
    }

    public void setCerita(String cerita) {
        this.cerita = cerita;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Boolean getCek() {
        return cek;
    }

    public void setCek(Boolean cek) {
        this.cek = cek;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}


