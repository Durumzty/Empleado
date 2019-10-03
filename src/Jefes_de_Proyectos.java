/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Jefes_de_Proyectos extends Empleado {

    /*Atributos*/
    private double salarioBase;
    private double numeroProyectos;
    final private static double incentivo = 100;

    public Jefes_de_Proyectos(String nombre, String apellidos, double salarioBase, double numeroProyectos) {
        super(nombre, apellidos);
        this.salarioBase = salarioBase;
        this.numeroProyectos = numeroProyectos;
    }

    /*Metodos*/
    public double getSalarioBase() {
        return salarioBase;
    }

    public double getNumeroProyectos() {
        return numeroProyectos;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNumeroProyectos(double numeroProyectos) {
        this.numeroProyectos = numeroProyectos;
    }

    public double salario(Jefes_de_Proyectos j) {
        double sal;
        sal = (j.getSalarioBase() + 25) * j.getNumeroProyectos();
        return sal;
    }

    @Override
    public String toString() {
        return "Jefe de proyectos: " + super.toString();
    }

}
