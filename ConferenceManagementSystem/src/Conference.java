
import javafx.beans.property.SimpleStringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranto
 */
public class Conference {
    
    private String confoName;
    private String confoID;
    private String topic;
    private String dateMonthYear;
    private String country;

    public Conference(String confoName, String confoID, String topic, String dateMonthYear, String country) {
        this.confoName = confoName;
        this.confoID = confoID;
        this.topic = topic;
        this.dateMonthYear = dateMonthYear;
        this.country = country;
    }

    public String getConfoName() {
        return confoName;
    }

    public void setConfoName(String confoName) {
        this.confoName = confoName;
    }

    public String getConfoID() {
        return confoID;
    }

    public void setConfoID(String confoID) {
        this.confoID = confoID;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDateMonthYear() {
        return dateMonthYear;
    }

    public void setDateMonthYear(String dateMonthYear) {
        this.dateMonthYear = dateMonthYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Conference{" + "confoName=" + confoName + ", confoID=" + confoID + ", topic=" + topic + ", dateMonthYear=" + dateMonthYear + ", country=" + country + '}';
    }

    
    
    
    public void createConference () {
    }
    
    public void showAllConference() {
        
    }
    
    public void showConference (Conference confoID) {
        
    }
    
    public void generateReport () {
        
    }
    public void editConference (){
        
    }

    
    
}
