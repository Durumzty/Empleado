/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Vendedores extends Empleado{
    /*Atributos*/
    private int electrodomesticosVendidos;
    private double comision;
    private final static double sb =900.00; //Salario base comun

    public Vendedores(String nombre, String apellidos,int electrodomesticosVendidos, double comision) {
        super(nombre,apellidos);
        this.electrodomesticosVendidos = electrodomesticosVendidos;
        this.comision = comision;
        
    }

    

    public double salario(){
    return (this.sb+this.getElectrodomesticosVendidos()+this.getComision());
    }
    
    public int getElectrodomesticosVendidos() {
        return electrodomesticosVendidos;
    }

    public void setElectrodomesticosVendidos(int electrodomesticosVendidos) {
        this.electrodomesticosVendidos = electrodomesticosVendidos;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Vendedor: " + super.toString();
    }

}
