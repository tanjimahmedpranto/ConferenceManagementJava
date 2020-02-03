/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranto
 */
abstract class User {
    
    protected String id;
    protected String password;
    
    
    
    User () {id=password=null;}

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
    
    public void verifyLogin ()
    {
    
    }
    
    public void showAllConference () 
    {
        
    }
    
    public void showConference (Conference confoID)
    {
        
    }
    
}




