/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Pranto
 */
public class ConferenceController implements Initializable {

    @FXML
    private TextField confoNameField;
    @FXML
    private TextField confoIDField;
    @FXML
    private TextField topicField;
    @FXML
    private TextField countryField;
    @FXML
    private Button createConferenceButton;
    @FXML
    private TextField confoDate;
    @FXML
    private Button showAllConferenceButton;
    @FXML
    private Button showThisConferenceButton;
    @FXML
    private TextField showThisConfoField;
    @FXML
    private Button countryReportButton;
    @FXML
    private Button topicReportButton;
    @FXML
    private PieChart countryPieChart;
    @FXML
    private BarChart<?, ?> topicBarChart;
    @FXML
    private TableView<Conference> table;
    @FXML
    private TableColumn<Conference, String> tableConfoName;
    @FXML
    private TableColumn<Conference, String> tableconfoID;
    @FXML
    private TableColumn<Conference, String> tableTopic;
    @FXML
    private TableColumn<Conference, String> tableDate;
    @FXML
    private TableColumn<Conference, String> tableCountry;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createConferenceButtonOnClick(ActionEvent event) {
         Conference confo = new Conference(tableConfoName.getText(),
                                       tableconfoID.getText(),
                                       tableTopic.getText(), 
                                        tableDate.getText(), tableCountry.getText()
                                    );
        table.getItems().add(confo);
        
    }

    @FXML
    private void showAllConferenceButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void showThisConferenceButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void countryReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void topicReportButtonOnClick(ActionEvent event) {
    }
    
}
