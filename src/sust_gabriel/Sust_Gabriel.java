/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sust_gabriel;

import java.util.Scanner;

/**
 *
 * @author practi17
 */
public class Sust_Gabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int opcion, i = 1, aux = 0, aux2=0, vender=0, cant, total_v=0;
        double price, total=0;
        Scanner lector = new Scanner(System.in);
        String buscar, eliminar, vent, name;
        boolean band = false, band2 = false;
        //Instanciacion de objetos
        Producto arrayProductos[] = new Producto[10]; //Supongo que tengo capacidad para 10 productos

        
        do{
            System.out.println("\nDigite una opcion ");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Realizar ventas");
            System.out.println("6.  Mostrar Ganancias Totales");
            System.out.println("0. Salir");
            opcion = lector.nextInt();
            switch (opcion){
                case 1:                
                    //Se indica cada uno de los parametros de cada objeto objeto
                    arrayProductos[i-1] = new Producto(); //iNSTANCIO CADA PRODUCTO
                    System.out.println("Ingrese datos del producto #"+i);
                    arrayProductos[i-1].Agregar_producto();
                    i = i + 1;        

                    break;
                case 2: 
                    System.out.println("Ingrese el nombre del producto que desea buscar: ");
                    buscar = lector.next();
                    for (int j = 0; j < i-1; j++){
                        if(buscar.equals(arrayProductos[j].getNombre())){
                            band=true;
                            aux=j;
                        }
                        if (band==true)
                            break;
                    }
                    if(band==true){
                            System.out.println("¡¡¡Producto encontrado!!!");
                            arrayProductos[aux].Mostar_Inventario(aux+1);
                        }
                        else{
                            System.out.println("¡¡¡El producto no existe!!!");
                        
                    }
                    band = false;
                    break;
                case 3: 
                    System.out.println("Ingrese el nombre del producto que desea eliminar: ");
                    eliminar = lector.next();
                    for (int k = 0; k < i-1; k++){
                        if(eliminar.equals(arrayProductos[k].getNombre())){
                            band=true;
                            aux2=k;
                        }
                        if (band==true)
                            break;
                    }
                    if(band==true){
                            System.out.println("¡¡¡Producto encontrado!!!");
                            name = arrayProductos[i-1].getNombre(); 
                            arrayProductos[aux2].setNombre(name);
                            cant = arrayProductos[i-1].getCantProd();
                            arrayProductos[aux2].setCantProd(cant);
                            price = arrayProductos[i-1].getPrecio();
                            arrayProductos[aux2].setPrecio(price);
                    }
                        else{
                             System.out.println("¡¡¡El producto no existe!!!");
                             band = true;
                        }
                        band = false;
                    break;
                case 4: 
                    System.out.println("*******Productos en el inventario********"); 
                    for (int l = 0; l < i-1; l++){
                        arrayProductos[l].Mostar_Inventario(l+1);
                    }
                    break;
                case 5:
                    //Se debe digitar el nombre del producto, si lo encuentra, se le
//solicitara al usuario la cantidad que desea vender, este dato debe quedar almacenado

                    System.out.println("Ingrese el nombre del producto que desea vender: ");
                    vent = lector.next();
                    for (int m = 0; m < i-1; m++){
                        if(vent.equals(arrayProductos[m].getNombre())){
                            band=true;
                            aux2=m;
                        }
                        if (band == true) break;
                    }
                    if(band==true){
                            System.out.println("¡¡¡Producto encontrado!!!");
                            System.out.println("Ingrese la cantidad de productos que desea vender: ");
                            vender = lector.nextInt();
                            if (vender<arrayProductos[aux2].getCantProd()){
                                 System.out.println("¡¡¡No tiene productos suficientes, ingrese nueva cantidad: !!!");
                                 vender = lector.nextInt();
                            }
                            else{
                                total_v = arrayProductos[aux2].getCantProd() - vender;
                                band = true;
                            }
                        }
                         band = false;
                    break;
                case 6: 
//Se visualizará cada uno de los productos con la
//cantidad de ventas de cada producto y el valor total de la venta, finalmente muestra
//el valor total de lo que ha vendido.
                for (int n = 1; n < i; n++){
                    System.out.println("Producto #"+n+
                            "\nNombre del producto: "+arrayProductos[n-1].getNombre()+
                            "\nCantidd de ventas: "+vender+
                            "\nValor total de la venta: "+total_v*vender);
                }
                    break;
                default:     
            }
        }while(opcion!=0);
        
    }
    
}
