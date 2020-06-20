/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;

/**
 *
 * @author HAP
 */
public class User {
    String username;
    String password;
    
    public void setUsername(String userName)
    {
        username = userName;
    }
    
     public String getUsername()
    {
        return username ;
    }
     
     public void setPassword(String password)
    {
        this.password = password;
    }
    
     public String getPassword()
    {
        return password ;
    }
     
     public String toString()
     {
         return this.username;
     }
}
