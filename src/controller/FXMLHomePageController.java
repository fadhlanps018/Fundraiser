package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLHomePageController implements Initializable {

    OpenScene bukaScene = new OpenScene();

    @FXML
    private BorderPane mainPane;

    @FXML
    private TextField tfCari;

    @FXML
    private void cariButton(ActionEvent event) throws IOException {

    }

    @FXML
    private void akunButton(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLProfil.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void donasiButton(ActionEvent event) throws IOException {
        Pane halaman = bukaScene.getPane("FXMLDonasi");
        mainPane.setCenter(halaman);
        System.out.println("Donasi's Button Clicked");
    }

    @FXML
    private void zakatButton(ActionEvent event) throws IOException {
        Pane halaman = bukaScene.getPane("FXMLZakat");
        mainPane.setCenter(halaman);
        System.out.println("Zakat's Button Clicked");
    }

    @FXML
    private void galangDanaButton(ActionEvent event) throws IOException {
        Pane halaman = bukaScene.getPane("FXMLGalangDana");
        mainPane.setCenter(halaman);
        System.out.println("Galang Dana's Button Clicked");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
