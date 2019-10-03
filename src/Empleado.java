/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public abstract class Empleado {
    /*Crear defaultListMode statico para que se guarden aqui todos los empleados creados*/
    
    
    /**
     @atributes
     */
    protected String nombre;
    protected String apellidos;
    
    
    
    /*Metodos*/

    @Override
    public String toString() {
        return nombre + apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public double salario(/*char tipo,double sb,int ud,double comision*/){//abstract
        double sal=0.00;
        
        /*j -> Jefes proyectos
          t -> trabajadores por horas
          m -> montadores
          v -> vendedores a comisión
        sb=salario base
        
        ud 
        
        switch(tipo){
            case 'j': 
                //incetivo comun para todos 25
                sal=(sb+25)*ud;
                break;
            case 't':
                sal=(ud*sb);
                break;
                
            case 'm':
                sal=ud*sb;
                break;
                
            case 'v':
                sal=sb+ud+comision;
                    break;
        }
        */
        
        return sal;
    }

    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    
}
