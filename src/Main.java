import cl.FiestaOnline.CompañerosColegio;
import cl.FiestaOnline.JuegosDeInfancia;
import cl.FiestaOnline.ListadoDePrecios;
import cl.FiestaOnline.MarcasAntiguas;

import java.util.*;

/**
 * Nombre del Package :
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : jueves 13 de junio de 2024
 * 13-06-2024 14:05
 * Nombre del Proyecto Default (Template) Project
 */
public class Main {
    public static void main(String[] args) {
        menuEjercicios();
     }

     public static void menuEjercicios(){
         Scanner sc = new Scanner(System.in);
         int opcion;
        do {
            System.out.println("Menu de Ejercicios");
            System.out.println("1- Ejercicio 1");
            System.out.println("2- Ejercicio 2");
            System.out.println("3- Ejercicio 3");
            System.out.println("4- Ejercicio 4");
            System.out.println("5- Salir");
            System.out.print(" ingrese opcion : ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                marcas();
            } else if (opcion == 2) {
                compañeros();
            } else if (opcion == 3) {
                golosinasInfancia();
            } else if (opcion == 4) {
                juegosInfancia();
            } else if (opcion == 5) {
                opcion=0;
            }
        }while (opcion <=5 && opcion >=1);
    }

     public static void marcas(){
         System.out.println("Se ingresan las 10 Marcas antiguas : ");
         System.out.println(" Electrolux, Almacenes Paris, Cambiaso Hermanos, Carozzi, IRT, Cousiño Macul, Concha y Toro, Santa Rita, M&s y Banco de Santiago");
         MarcasAntiguas marcasAntiguas = new MarcasAntiguas();
         marcasAntiguas.agregarMarcas();
     }

     public static void compañeros(){
         System.out.println("Se agrega el siguiente listado de compañeros : ");
         System.out.println(" “Daniel”,“Paola”, “Facundo”, “Pedro”, ”Jacinta”, “Florencia” y “Juan Pablo”");
         CompañerosColegio companerosColegio = new CompañerosColegio();
         companerosColegio.agregarcompañeros();
     }

     public static void golosinasInfancia(){
         ListadoDePrecios listadoDePrecios = new ListadoDePrecios();
         listadoDePrecios.agregarGolosinas();
     }

     public static void juegosInfancia(){
         JuegosDeInfancia juegosDeInfancia = new JuegosDeInfancia();
         juegosDeInfancia.agrgarJuego();
     }




}