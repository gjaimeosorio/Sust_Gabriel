/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sust_gabriel;

import java.util.Scanner;
import  java.lang.Object;

/**
 *
 * @author practi17
 */
public class Producto {
    
    private String nombre;
    private int cantProd;
    private double precio;
    Scanner lector = new Scanner(System.in);


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantProd() {
        return cantProd;
    }

    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void Agregar_producto(){
            System.out.println("Digite el nombre del producto: ");
            nombre = lector.next();
            System.out.println("Digite la cantidad de productos: ");
            cantProd = lector.nextInt();
            System.out.println("Digite el precio por unidad: ");
            precio = lector.nextDouble();
    }          
    
    public void Mostar_Inventario(int i){
        System.out.println("Producto #"+i+
                "\nNombre del producto: "+nombre+
                "\nCantidad de productos: "+cantProd+
                "\nPrecio por unidad: "+precio);
    }
   

  
}
