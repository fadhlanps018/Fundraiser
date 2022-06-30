package controller;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ArrayList;

public class FXMLGalangDanaController implements Initializable {

    ArrayList<DataGalangDana> dataForm = new ArrayList<DataGalangDana>();
    DataGalangDana dataPenggalangan;

    @FXML
    private TextField tfJudul;

    @FXML
    private TextField tfDana;

    @FXML
    private TextArea tfDeskripsi;

    @FXML
    private ChoiceBox cbKategori;

    @FXML
    private void balikButton(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
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

    @FXML
    private void buatGalangDanaButton(ActionEvent event) {
                openTabel();

        XStream xstream = new XStream(new StaxDriver());
        String judulGalang = tfJudul.getText();
        String danaDibutuhkan = tfDana.getText();
        String deskripsiGalangDana = tfDeskripsi.getText();
//        String kategoriGalangDana = "";
//        if (cbKategori.getValue().equals("Pendidikan")) {
//            kategoriGalangDana = "Pendidikan";
//        } else if (cbKategori.getValue().equals("Medis")) {
//            kategoriGalangDana = "Medis";
//        } else if (cbKategori.getValue().equals("Pembangunan")) {
//            kategoriGalangDana = "Pembangunan";
//        } else if (cbKategori.getValue().equals("Bencana Alam")) {
//            kategoriGalangDana = "Bencana Alam";
//        } else {
//
//        }
        dataForm.add(new DataGalangDana(judulGalang, danaDibutuhkan,"bencana alam", deskripsiGalangDana));
        
        System.out.println(dataForm.get(0).getJudulGalangDana());


        String xml = xstream.toXML(dataForm);
        FileOutputStream berkasKeluar;

        try {
            byte[] info = xml.getBytes("UTF-8");
            berkasKeluar = new FileOutputStream("berkas.xml");
            berkasKeluar.write(info);
            berkasKeluar.close();

        } catch (Exception io) {
            System.out.println("Terjadi kesalahan : " + io.getMessage());
        }

        System.out.println("CreateButton is clicked");
    }

    @FXML
    private void tambahGambarButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        openTabel();
        dataPenggalangan = new DataGalangDana();
    }

}
