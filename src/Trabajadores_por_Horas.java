/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Trabajadores_por_Horas extends Empleado {

    /*Atributos*/
    private int numeroHorasTrabajadas;
    private double salarioPorHora;

    public Trabajadores_por_Horas(String nombre, String apellidos, int numeroHorasTrabajadas, double salarioPorHora) {
        super(nombre, apellidos);
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    /*METODOS*/
    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public String toString() {
        return "Trabajador por horas : " + super.toString();
    }

    public double salario() {

        return (this.getNumeroHorasTrabajadas() * this.getSalarioPorHora());
    }

}
