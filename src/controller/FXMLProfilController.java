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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLProfilController implements Initializable {

    OpenScene bukaScene = new OpenScene();

    @FXML
    private BorderPane mainPane;

    @FXML
    private void balikButton(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
    
    @FXML
    private void kantongDonasiButton(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLKantongDonasi");
        mainPane.setCenter(halaman);
        System.out.println("Kantong Donasi's Button Clicked");
    }

    @FXML
    private void persentaseKebaikanButton(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLDiagramKebaikan");
        mainPane.setCenter(halaman);
        System.out.println("Persentase Kebaikan's Button Clicked");
    }

    @FXML
    private void galangDanaKamuButton(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLTabelGalangDana");
        mainPane.setCenter(halaman);
        System.out.println("Galang Dana Kamu's Button Clicked");
    }

    @FXML
    private void menunaikanZakatButton(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLMenunaikanZakat");
        mainPane.setCenter(halaman);
        System.out.println("Menunaikan Zakat's Button Clicked");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
