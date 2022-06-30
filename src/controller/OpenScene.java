package controller;

import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class OpenScene {

    private Pane halaman;

    public Pane getPane(String namaFile) {
        try {
            URL fileHalaman = FundraiserProject.class.getResource("/controller/" + namaFile + ".fxml");
            if (fileHalaman == null) {
                throw new java.io.FileNotFoundException("Halaman tidak ditemukan");
            }

            halaman = FXMLLoader.load(fileHalaman);
        } catch (Exception e) {
            System.out.println("Tidak dapat menemukan halaman");
        }
        return halaman;
    }
}
