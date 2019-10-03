/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Montador extends Empleado{
    /*Atributos*/
    private int numeroElectrodomesticos;
    private double importePorUnidad;

    public Montador(String nombre, String apellidos, int numeroElectrodomesticos, double importePorUnidad) {
        super(nombre, apellidos);
        this.numeroElectrodomesticos = numeroElectrodomesticos;
        this.importePorUnidad = importePorUnidad;
    }
    
    
    
    /*Metodos*/

    public int getNumeroElectrodomesticos() {
        return numeroElectrodomesticos;
    }

    public void setNumeroElectrodomesticos(int numeroElectrodomesticos) {
        this.numeroElectrodomesticos = numeroElectrodomesticos;
    }

    public double getImportePorUnidad() {
        return importePorUnidad;
    }

    public void setImportePorUnidad(double importePorUnidad) {
        this.importePorUnidad = importePorUnidad;
    }
    
    public double salario(){
    
        return (this.getImportePorUnidad() * this.getNumeroElectrodomesticos());
    }
    
            @Override
    public String toString() {
        return "Montador : "+super.toString();
    }

    
}
