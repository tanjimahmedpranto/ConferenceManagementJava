/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranto
 */
public class ConferenceOrganiser extends User implements CanManageUserProfile {
    private String name;
    private String position;
    private String dept;

    ConferenceOrganiser(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ConferenceOrganiser{" + "name=" + name + ", position=" + position + ", dept=" + dept + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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

    public ConferenceOrganiser(String name, String position, String dept) {
        this.name = name;
        this.position = position;
        this.dept = dept;
    }
    
    
    public void addUser ()
    {
        
    }
   
    @Override
    public void removeUser ()
    {
        
    }
    
    
    private void createConference (){
        
    }
    
    public void showAllConference (){
        
    }
    public void trackpaper (){
        
    }
    public void paperComment (){
        
    }

    @Override
    public void adduser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
