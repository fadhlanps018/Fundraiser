package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListGalangDana {

    private ObservableList<DataGalangDana> listData;

    public ListGalangDana() {
        listData = FXCollections.observableArrayList();
    }

    public ObservableList<DataGalangDana> getData() {
        return this.listData;
    }

    public void setData(String judulGalangDana, String DanaDibutuhkan, String deskripsiGalangDana, String kategoriGalangDana) {
        listData.add(new DataGalangDana(judulGalangDana, DanaDibutuhkan, deskripsiGalangDana, kategoriGalangDana));
    }

    public void setDummy() {
        
    }
}
