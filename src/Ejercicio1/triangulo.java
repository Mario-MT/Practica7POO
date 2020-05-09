/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Mario Mendoza
 */
public class triangulo implements Area, Perimetro {

    public double area;
    public double perimetro;

    @Override
    public double calcularArea(double base, double altura) {
        return base * altura / 2;
    }

    @Override
    public double calcularperimetro(double lAB, double lC) {
        return 2 * lAB + lC;
    }

}
