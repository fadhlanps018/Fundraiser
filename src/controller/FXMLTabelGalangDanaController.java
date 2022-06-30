package controller;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.util.ArrayList;

public class FXMLTabelGalangDanaController implements Initializable {

    ObservableList dataTabel = observableArrayList();
    ArrayList<DataGalangDana> dataForm = new ArrayList<>();

    @FXML
    private TableView<DataGalangDana> tvGalangDana;

    @FXML
    private TableColumn<DataGalangDana, String> tcJudul;

    @FXML
    private TableColumn<DataGalangDana, String> tcDana;

    @FXML
    private TableColumn<DataGalangDana, String> tcKategori;

    @FXML
    private TableColumn<DataGalangDana, String> tcDeskripsi;

    @FXML
    private void buatGalangDanaButton(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLGalangDana.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void editButton(ActionEvent event) {

    }

    @FXML
    private void hapusButton(ActionEvent event) {
        int selectedID = tvGalangDana.getSelectionModel().getSelectedIndex();
        tvGalangDana.getItems().remove(selectedID);
    }

    void openTabel() {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream berkasMasuk;
        try {
            berkasMasuk = new FileInputStream("berkas.xml");
            int isi;
            char c;
            String s = "";
            while ((isi = berkasMasuk.read()) != - 1) {
                c = (char) isi;
                s = s + c;
            }
            dataForm = (ArrayList<DataGalangDana>) xstream.fromXML(s);
            berkasMasuk.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcJudul.setCellValueFactory(new PropertyValueFactory<>("judulGalangDana"));
        tcDana.setCellValueFactory(new PropertyValueFactory<>("danaDibutuhkan"));
        tcKategori.setCellValueFactory(new PropertyValueFactory<>("kategoriGalangDana"));
        tcDeskripsi.setCellValueFactory(new PropertyValueFactory<>("deskripsiGalangDana"));
        
        openTabel();
     
        for (int i = 0; i < dataForm.size(); i++) {
            dataTabel.add(dataForm.get(i));  
        }
             
        tvGalangDana.setItems(dataTabel);
    }

}
