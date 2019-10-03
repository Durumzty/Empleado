
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Test{
    
    
    public static void main(String[] args) {
    
        ArrayList <Empleado> ListaEmpleados = new ArrayList();
        
        Empleado j1 = new Jefes_de_Proyectos("Sergio", "Martin", 2500.50,3);
        ListaEmpleados.add(j1);
        ListaEmpleados.add(j1);
        
        Empleado t1 = new Trabajadores_por_Horas("Pablo", "Paki", 20, 15);
        ListaEmpleados.add(t1);
        ListaEmpleados.add(t1);
        
        Empleado m1 = new Montador("Alejandro", "Rinho", 50, 25);
        ListaEmpleados.add(m1);
        ListaEmpleados.add(m1);
        
        Empleado v1= new Vendedores("Alfonso", "Aquarpark Master", 100, 90.5);
        ListaEmpleados.add(v1);
        ListaEmpleados.add(v1);
        
        for(Empleado e: ListaEmpleados){
            
            System.out.println(e.toString() +" Salario: " + e.salario());

            
        }
    }
}
