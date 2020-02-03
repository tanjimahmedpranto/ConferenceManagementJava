/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranto
 */
public class Author extends User {
    
    private String name;
    private String address;
    private String FieldOfStudy;
    public int paperID;

    public Author(String name, String address, String FieldOfStudy, int paperID) {
        this.name = name;
        this.address = address;
        this.FieldOfStudy = FieldOfStudy;
        this.paperID = paperID;
    }

    Author() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Author(String text, String text0, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFieldOfStudy() {
        return FieldOfStudy;
    }

    public void setFieldOfStudy(String FieldOfStudy) {
        this.FieldOfStudy = FieldOfStudy;
    }

    public int getPaperID() {
        return paperID;
    }

    public void setPaperID(int paperID) {
        this.paperID = paperID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    void uploadPaper (   ) {
        
    }
    
    public void trackPaper (){
        
    }
    private void withdrawPaper (){
        
    }
    public void GenerateReport (){
        
    }
}
