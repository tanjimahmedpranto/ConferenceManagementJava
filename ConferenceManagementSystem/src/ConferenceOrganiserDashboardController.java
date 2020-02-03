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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pranto
 */
public class ConferenceOrganiserDashboardController implements Initializable {

    @FXML
    private Button signOutButton;
    @FXML
    private MenuItem UserInterface;
    @FXML
    private MenuItem openPaperComments1;
    @FXML
    private MenuItem coAbout;
    @FXML
    private Label commentLabel;
    @FXML
    private MenuItem confoStage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

 

    @FXML
    private void openPaperCommentsOnClick(ActionEvent event) {
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
    private void UserInterfaceOnClick(ActionEvent event) {
    }

    @FXML
    private void coAboutOnClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Admin about");
        alert.setHeaderText("Information Alert");
        String s ="This is an Conference Organiser panel...Choose the menu items to do various functions ";
        alert.setContentText(s);
        alert.show(); 
        
    }

    @FXML
    private void confoStageOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("Conference.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        
        Stage window  = new Stage();
        
        window.setTitle("Conference Management");
        window.setScene(fileChooserViewScene);
        window.show();
    }
    
}
