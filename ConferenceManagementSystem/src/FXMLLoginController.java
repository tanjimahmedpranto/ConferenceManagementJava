/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Pranto
 */
public class FXMLLoginController implements Initializable {
    
    private Label label;
    @FXML
    private TextField idtextField;
    @FXML
    private TextField passwordField;
    @FXML
    private ComboBox<String> userComboBox;
    @FXML
    private Button signupButton;
    @FXML
    private Button loginButton;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userComboBox.getItems().add("Admin");
        userComboBox.getItems().addAll("Conference Organiser","Reviewer","Author");
    }    

    @FXML
    private void idtextFieldOnClick(ActionEvent event) {
        idtextField.setText(null);
    }

    @FXML
    private void passwordFieldOnClick(ActionEvent event) {
        passwordField.setText(null);
    }

    @FXML
    private void userComboBoxOnClick(ActionEvent event) {
    }

    @FXML
    private void signupButtonOnClick(ActionEvent event) {
        Parent scene2Parent = null;
        try {
            scene2Parent = FXMLLoader.load(getClass().getResource("CanSignUp.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
        
        if((idtextField.getText().equals("admin")) && (passwordField.getText().equals("admin")) && (userComboBox.getValue().equals("Admin"))) {
            
            Parent scene2Parent = null;
        try {
            scene2Parent = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
        
        // OTHER USERS LOGIN
        
        ObjectInputStream in = null;
        boolean isMatch = false;
        String name = idtextField.getText();
        String pass = passwordField.getText();
        String selected = userComboBox.getValue();
        
        // CONFERENCE ORGANISER LOGIN
        if(selected == "Conference Organiser"){
            try {  
                in = new ObjectInputStream(new FileInputStream("ConferenceOrganiser.bin"));
                ConferenceOrganiser co;
                while( (co = (ConferenceOrganiser)in.readObject()) != null ) {
                    if(co.getName().equals(name) && co.getPassword().equals(pass)){                       
                        isMatch = true;
                        break;
                    }
                }
                in.close();
            } catch (Exception e) {
                
            }
            
            if(isMatch == true){
                
                Parent scene2Parent = null;
        try {
            scene2Parent = FXMLLoader.load(getClass().getResource("ConferenceOrganiserDashboard.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
                
            } 
                
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle(" Error");
                String s = "Log in Error";
                alert.setContentText(s);
                alert.showAndWait();
            }
        
        // REVIEWER LOGIN
        if(selected == "Reviewer"){
            try {  
                in = new ObjectInputStream(new FileInputStream("Reviewer.bin"));
                Reviewer r;
                while( (r = (Reviewer)in.readObject()) != null ) {
                    if(r.getName().equals(name) && r.getPassword().equals(pass)){                       
                        isMatch = true;
                        break;
                    }
                }
                in.close();
            } catch (Exception e) {
                
            }
            
            if(isMatch == true){
                
                Parent scene2Parent = null;
        try {
            scene2Parent = FXMLLoader.load(getClass().getResource("ReviewerDashboard.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
                
            } 
                
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle(" Error");
                String s = "Log in Error";
                alert.setContentText(s);
                alert.showAndWait();
            }
        
        // AUTHOR LOGIN
         if(selected == "Author"){
            try {  
                in = new ObjectInputStream(new FileInputStream("Author.bin"));
                Author a;
                while( (a = (Author)in.readObject()) != null ) {
                    if(a.getName().equals(name) && a.getPassword().equals(pass)){                       
                        isMatch = true;
                        break;
                    }
                }
                in.close();
            } catch (Exception e) {
                
            }
            
            if(isMatch == true){
                
                Parent scene2Parent = null;
        try {
            scene2Parent = FXMLLoader.load(getClass().getResource("AuthorDashboard.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
                
            } 
                
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle(" Error");
                String s = "Log in Error";
                alert.setContentText(s);
                alert.showAndWait();
            }
    
    
    
    
    
    
    } 
  }
    

