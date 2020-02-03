
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranto
 */
public class Admin extends User implements CanManageUserProfile {
    
    public void addUser ()
    {
      
    }
   
    @Override
    public void removeUser ()
    {
        
    }
    
    //public void editConference (confoID) { }
    
    public void showAllConference () { }
    
    public void generateCountryReport () { }
    
    public void generateTopicReport () { }

    @Override
    public void adduser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
