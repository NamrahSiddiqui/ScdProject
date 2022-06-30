
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Athlete extends UnicastRemoteObject implements IDisplay{
    String FirstName; 
    String LastName;
    String description;
    
    
 Athlete() throws RemoteException
{
    super();
}

    @Override
    public String displayData(String FirstName, String LastName, String description) throws RemoteException {
        System.out.println("Display Funtion for an Athlete");
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.description=description;
        System.out.println(FirstName +" "+ LastName +" "+ description);
        return "done";
    }
   

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
     public Athlete(String FirstName, String LastName, String description) throws RemoteException
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.description=description;
    
    }  
    
    
}
