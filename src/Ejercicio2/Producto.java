/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mario Mendoza
 */
public class Producto implements Impuesto, caducidad {

    public double impuesto;
    public String caducidad;

    @Override
    public double iva(double precio) {
        return Math.round(precio * 1.13 *100)/100;
    }

    @Override
    public String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/YYYY");
        return formatoFecha.format(fecha);
    }

}
