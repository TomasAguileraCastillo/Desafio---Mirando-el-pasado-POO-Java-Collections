package cl.FiestaOnline;

import java.util.Map;
import java.util.TreeMap;

/**
 * Nombre del Package :cl.FiestaOnline.MarcasAntiguas
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : jueves 13 de junio de 2024
 * 13-06-2024 22:54
 * Nombre del Proyecto Desafio - Mirando el pasado
 */
public class ListadoDePrecios {
    //Atributos
    Map<String, Integer> golosinas = new TreeMap<>();

    //Constructor Vacio

    public ListadoDePrecios() {
    }


    //Constructor Completo

    public ListadoDePrecios(Map<String, Integer> golosinas) {
        this.golosinas = golosinas;
    }


    //Metodos

    public void agregarGolosinas(){


        golosinas.put("Chocman",100);
        golosinas.put("Trululú",100);
        golosinas.put("Centella",100);
        golosinas.put("Kilate",50);
        golosinas.put("Miti-miti",30);
        golosinas.put("Traga Traga",150);
        golosinas.put("Tabletón",5);

        System.out.println("Listado de Golosinas"+golosinas);

        System.out.println();

        System.out.println("listado de golosinas que cuestan menos de 100 pesos");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue()<100) {
                System.out.printf("nombre : %s - valor : %d \n", entry.getKey(), entry.getValue());
            }
        }
        System.out.println();

    }


    //Getters y Setters

    public Map<String, Integer> getGolosinas() {
        return golosinas;
    }

    public void setGolosinas(Map<String, Integer> golosinas) {
        this.golosinas = golosinas;
    }
}
