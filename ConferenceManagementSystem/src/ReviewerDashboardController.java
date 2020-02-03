/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pranto
 */
public class ReviewerDashboardController implements Initializable {

    @FXML
    private MenuItem openPaperMenu;
    @FXML
    private Label outputPaperLabel;
    @FXML
    private TextArea commentTextArea;
    @FXML
    private RadioButton excellRButton;
    @FXML
    private RadioButton goodRButton;
    @FXML
    private RadioButton acceptableRButton;
    @FXML
    private RadioButton rejectRButton;
    @FXML
    private Button submitPaperStatusButton;
    @FXML
    private Button signOutButton;
    @FXML
    private MenuItem about;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ToggleGroup tg = new ToggleGroup();
        excellRButton.setToggleGroup(tg);
        goodRButton.setToggleGroup(tg);
        acceptableRButton.setToggleGroup(tg);
        rejectRButton.setToggleGroup(tg);
        
        
    }    

    @FXML
    private void openPaperMenuOnClick(ActionEvent event) {
    }

    @FXML
    private void radioButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void submitPaperStatusButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void signOutButtonOnClick(ActionEvent event) {
        Parent mainSceneParent = null;
        try {
            mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(CanSignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void aboutOnClick(ActionEvent event) {
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Admin about");
        alert.setHeaderText("Information Alert");
        String s ="This is an Reviewer panel...Choose the menu items to do various functions ";
        alert.setContentText(s);
        alert.show(); 
    }
    
}
