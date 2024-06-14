package cl.FiestaOnline;

import java.util.ArrayList;

/**
 * Nombre del Package :cl.FiestaOnline
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : jueves 13 de junio de 2024
 * 13-06-2024 22:55
 * Nombre del Proyecto Desafio - Mirando el pasado
 */
public class MarcasAntiguas {
    //Atributos
    ArrayList<String> marcas = new ArrayList<>();

    //Constructor Vacio

    public MarcasAntiguas() {
    }


    //Constructor Completo

    public MarcasAntiguas(ArrayList<String> marcas) {
        this.marcas = marcas;
    }


    //Metodos

    public void agregarMarcas(){
        marcas.add("Electrolux");
        marcas.add("Almacenes Paris");
        marcas.add("Cambiaso Hermanos");
        marcas.add("Carozzi");
        marcas.add("IRT");
        marcas.add("Cousiño Macul");
        marcas.add("Concha y Toro");
        marcas.add("Santa Rita");
        marcas.add("M&s");
        marcas.add("Banco de Santiago");

        System.out.println("listado de Marcas" + marcas);
        otrasAcciones();

    }

    public void otrasAcciones(){
        System.out.println("se agregan 3 marcas mas, Blokbaster, Carrefour y Jetix");
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        System.out.println();
        System.out.println("Nuevo Listado Completo" + marcas);
        System.out.println();
        System.out.println("Blokbaster esta mal escrito, se cambiara por Blockbuster ");
        int indicePalabra1 = marcas.indexOf("Blokbaster");
        marcas.set(indicePalabra1,"Blockbuster");

        System.out.println();

        System.out.println("Al parecer Carrefour aún existe, entonces se borrara de la lista ");
        boolean eliminado = marcas.remove("Carrefour");
        if (eliminado == true) {
            System.out.println("Eliminado Correctamente : True");
        }

        System.out.println("Se agregaran 5 Marcas antiguas mas en un nuevo listado");
        System.out.println();
        System.out.println(" Electrolux, Almacenes Paris, Cambiaso Hermanos, Carozzi, IRT, Cousiño Macul, Concha y Toro, Santa Rita, M&s y Banco de Santiago");

        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("wild country");
        posiblesMarcas.add("negrita");
        posiblesMarcas.add("calugon pelayo");
        posiblesMarcas.add("malboro");
        posiblesMarcas.add("derby");
        marcas.addAll(posiblesMarcas);
        System.out.println("Listado total de Marcas "+marcas);
        System.out.println("Total de Marcas es : " + marcas.size());
        System.out.println();
    }



    //Getters y Setters

    public ArrayList<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<String> marcas) {
        this.marcas = marcas;
    }
}
