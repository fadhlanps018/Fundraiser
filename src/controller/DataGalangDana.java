package controller;

public class DataGalangDana {

    public String judulGalangDana;
    private String danaDibutuhkan;
    private String kategoriGalangDana;
    private String deskripsiGalangDana;

    public DataGalangDana(){
        this("","","","");
    }
    public DataGalangDana(String judulGalangDana, String danaDibutuhkan, String kategoriGalangDana, String deskripsiGalangDana) {
        this.judulGalangDana = judulGalangDana;
        this.danaDibutuhkan = danaDibutuhkan;
        this.kategoriGalangDana = kategoriGalangDana;
        this.deskripsiGalangDana = deskripsiGalangDana;
    }
    
    public DataGalangDana(String judulGalangDana, String danaDibutuhkan, String deskripsiGalangDana) {
        this.judulGalangDana = judulGalangDana;
        this.danaDibutuhkan = danaDibutuhkan;
//        this.kategoriGalangDana = kategoriGalangDana;
        this.deskripsiGalangDana = deskripsiGalangDana;
    }

    public String getJudulGalangDana() {
        return judulGalangDana;
    }

    public void setJudulGalangDana(String judulGalangDana) {
        this.judulGalangDana = judulGalangDana;
    }

    public String getDanaDibutuhkan() {
        return danaDibutuhkan;
    }

    @Override
    public String toString() {
        return "DataGalangDana{" + "judulGalangDana=" + judulGalangDana + ", danaDibutuhkan=" + danaDibutuhkan + ", kategoriGalangDana=" + kategoriGalangDana + ", deskripsiGalangDana=" + deskripsiGalangDana + '}';
    }

    public void setDanaDibutuhkan(String DanaDibutuhkan) {
        this.danaDibutuhkan = DanaDibutuhkan;
    }

    public String getKategoriGalangDana() {
        return kategoriGalangDana;
    }

    public void setKategoriGalangDana(String kategoriGalangDana) {
        this.kategoriGalangDana = kategoriGalangDana;
    }

    public String getDeskripsiGalangDana() {
        return deskripsiGalangDana;
    }

    public void setDeskripsiGalangDana(String deskripsiGalangDana) {
        this.deskripsiGalangDana = deskripsiGalangDana;
    }

}
