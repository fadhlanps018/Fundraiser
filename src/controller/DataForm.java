package controller;

public class DataForm {
    String judul;
    String dana;
    String kategori;
    String deskripsi;

    public DataForm(String judul, String dana, String kategori, String deskripsi) {
        this.judul = judul;
        this.dana = dana;
        this.kategori = kategori;
        this.deskripsi = deskripsi;   
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDana() {
        return dana;
    }

    public void setDana(String dana) {
        this.dana = dana;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
