/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;
import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;
/**
 *
 * @author estel
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Esta clase es la que contiene los metodos para operar con la tabla de personas:
        PersonasJDBC personasJDBC=new PersonasJDBC();
        //prueba del metodo insert:
        personasJDBC.insert("Alberto","Juarez");/*Comentar para no obtener un nuevo insert*/
        
        //Prueba del metodo Update:
        personasJDBC.update(2,"Update","Java");/*Comentar para no tener un update reiterado*/
        
        //Prueba del metodo Delete:
        personasJDBC.delete(7);/*comentar para no borrar el mismo dato siempre*/
        
        //Prueba del metodo Select:
        //Uso del objeto Persona para encapsular la información
        //de un regristo de base de datos:
        List<Persona>personas=personasJDBC.select();
        for(Persona persona:personas){
            //Recordar que el metodo toString esta modificado
            //Por lo cual se puede llamar sin problemas y no traera solamente el
            //espacio en la memoria:
            System.out.println(persona);
            System.out.println("");
        }
    }
    
}
