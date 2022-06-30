/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
import java.rmi.*;
import java.rmi.registry.*;
public class MyServer {




    public static void main(String[] args) {
   try{
             IDisplay stub=new Athlete();
            Naming.rebind("rmi://localhost:5000/Rectangle", stub);
    }
    catch(Exception e)
    {
        System.out.println(e);
    } 
       
}
}
