package cl.FiestaOnline;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Nombre del Package :cl.FiestaOnline
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : jueves 13 de junio de 2024
 * 13-06-2024 22:55
 * Nombre del Proyecto Desafio - Mirando el pasado
 */
public class JuegosDeInfancia {
    //Atributos
    Queue juegos = new LinkedList<>();

    //Constructor Vacio

    public JuegosDeInfancia() {
    }


    //Constructor Completo

    public JuegosDeInfancia(Queue juegos) {
        this.juegos = juegos;
    }


//Metodos

    public void agrgarJuego(){
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        System.out.println();
        System.out.println("El listado de Juegos es: " + juegos);

        System.out.println("El Total de juego del recuerdo es " + juegos.size());
        System.out.println();


    }

    //Getters y Setters


    public Queue getJuegos() {
        return juegos;
    }

    public void setJuegos(Queue juegos) {
        this.juegos = juegos;
    }
}
