
import java.io.PrintStream;
import java.rmi.Naming;
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
public class MyClient {
    int id;
    static String FirstName;
    static String LastName;
     static String description;
    Controller controller;
    ResultSet rs;
    
public MyClient(String FirstName, String LastName, String description) throws RemoteException
{
   
    this.FirstName=FirstName;
    this.LastName=LastName;
    this.description=description;
   controller=new Controller(FirstName,LastName, description);
   controller.add();
}
public MyClient(int id)
{
     Controller c= new Controller();
     rs= c.show(id);
}

 public static void main(String args[]) throws RemoteException
{ 
  
   
    try{
        
        IDisplay stub=(IDisplay)Naming.lookup("rmi://localhost:5000/Rectangle");
        System.out.println(stub.displayData(FirstName,LastName,description));
    }catch(Exception e)
    {
        System.out.println(e);
    }
   
}
}

