/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Pranto
 */
public class CanManageUserProfileController implements Initializable {

    @FXML
    private TextField idField;
    @FXML
    private TextField passwordField;
    @FXML
    private ComboBox<String> comboGroup;
    @FXML
    private Button addUserButton;
    @FXML
    private Button removeUserButton;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> tableId;
    @FXML
    private TableColumn<?, ?> tableName;
    @FXML
    private TableColumn<?, ?> tableGrp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboGroup.getItems().add("Conference Organiser");
        comboGroup.getItems().addAll("Reviewer","Author");
    }    

    @FXML
    private void idFieldOnClick(ActionEvent event) {
    }

    @FXML
    private void passwordFieldOnClick(ActionEvent event) {
    }

    @FXML
    private void addUserButtonOnClick(ActionEvent event) {
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            if (comboGroup.getValue().equals("Conference Organiser"))
                 f = new File("CO.bin");
                     ConferenceOrganiser co = new ConferenceOrganiser
                    ( idField.getText(),
                    passwordField.getText(),
                    comboGroup.getValue() );
                    oos.writeObject(co);
            
            if (comboGroup.getValue().equals("Reviewer")) 
                 f = new File("Reviewer.bin");
                     Reviewer r = new Reviewer
                    ( idField.getText(),
                    passwordField.getText(),
                    comboGroup.getValue() );
                    oos.writeObject(r);
                    
            if (comboGroup.getValue().equals("Author"))
                    f = new File("Author.bin");
                     Author a = new Author
                    ( idField.getText(),
                    passwordField.getText(),
                    comboGroup.getValue() );
                    oos.writeObject(a);

                    if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
           

        } catch (IOException ex) {
            
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                
            }
        }  
        
    }

    @FXML
    private void removeUserButtonOnClick(ActionEvent event) {
    }
    
}
