package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class FXMLDiagramKebaikanController implements Initializable {

    XYChart.Series dataKebaikan = new XYChart.Series<>();

    @FXML
    private BarChart bcKebaikan;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dataKebaikan.getData().add(new XYChart.Data("Januari", 300));
        dataKebaikan.getData().add(new XYChart.Data("Febuari", 200));
        dataKebaikan.getData().add(new XYChart.Data("Maret", 500));
        dataKebaikan.getData().add(new XYChart.Data("April", 350));

        bcKebaikan.getData().addAll(dataKebaikan);
    }

}
