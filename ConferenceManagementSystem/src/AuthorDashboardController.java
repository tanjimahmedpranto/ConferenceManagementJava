/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pranto
 */
public class AuthorDashboardController implements Initializable {

    @FXML
    private MenuItem uploadPaperButton;
    @FXML
    private Button trackPaperButton;
    @FXML
    private Button signOutButton;
    @FXML
    private Label paperStatus;
    @FXML
    private CheckBox editFileContentCheckBox;
    @FXML
    private Label fileContentLabel;
    @FXML
    private Button saveEditText;
    @FXML
    private MenuItem wPaper;
    @FXML
    private MenuItem report;
    @FXML
    private MenuItem authorAbout;
    ArrayList<String> fileTypeList;
    @FXML
    private TextArea textArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fileTypeList = new ArrayList<String>();
        fileTypeList.add("*.txt");
        fileTypeList.add("*.doc");
        fileTypeList.add("*.docx");
        fileTypeList.add("*.TXT");
        fileTypeList.add("*.DOC");
        fileTypeList.add("*.DOCX");
        // TODO
    }    

    @FXML
    private void uploadPaperButtonOnClick(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
        List<File> files = fc.showOpenMultipleDialog(null);
        String str="";
        for(File f: files){
            if(f != null){
                try {
                    Scanner sc = new Scanner(f);
                    
                    while(sc.hasNextLine()){
                        str+=sc.nextLine()+"\n";
                    }
                    str+="\n";
                } catch (FileNotFoundException ex) {
                    
                }
            }
        }
        fileContentLabel.setText(str);
    }

    @FXML
    private void trackPaperButtonOnClick(ActionEvent event) {
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
    private void editFileContentCheckBoxOnClick(ActionEvent event) {
        textArea.setEditable(true);
        textArea.setText(fileContentLabel.getText());
    }

    @FXML
    private void saveEditTextOnClick(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File f = fc.showSaveDialog(null);
        System.out.println("Edited Content will be written in: "+f.getAbsolutePath());
        final String content = textArea.getText();
        if(f != null){
            try {
            PrintWriter writer;
            writer = new PrintWriter(f);
            writer.println(content);
            writer.close();
        } catch (IOException ex) {
                System.out.println(ex);
        }
        }
    }

    @FXML
    private void wPaperOnClick(ActionEvent event) {
    }

    @FXML
    private void reportOnClick(ActionEvent event) {
    }

    @FXML
    private void authorAboutOnClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Admin about");
        alert.setHeaderText("Information Alert");
        String s ="This is an author panel...Choose the menu items to do various functions ";
        alert.setContentText(s);
        alert.show(); 
    }
    
}
