
import java.rmi.RemoteException;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Controller {
    Athlete athlete;
    DBHandler dbHandler;
    
    
    
    public Controller(String FirstName, String LastName, String description) throws RemoteException 
    {
        athlete=new Athlete(FirstName, LastName,description) ;
      
      
        dbHandler=new DBHandler();
    }
     public void add()
    {
       String query="INSERT INTO data(firstname,lastname,description) values " + "('"+athlete.getFirstName()+"', '"+athlete.getLastName()+"', '"+athlete.getDescription()+"')";
   
 
       dbHandler.addData(query);
      
    }
      public ResultSet show(int id)
    {
    
    String query="select * from data where id='"+id+"'";
    ResultSet rs=dbHandler.showData(query);
    return rs;
    
    }
     
     
     public Controller(){
          dbHandler=new DBHandler();
      }
      
    
            
}
